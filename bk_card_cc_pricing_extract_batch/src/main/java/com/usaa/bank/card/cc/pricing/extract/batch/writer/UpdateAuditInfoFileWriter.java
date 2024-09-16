package com.usaa.bank.card.cc.pricing.extract.batch.writer;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.JSftpException;
import com.usaa.bank.card.cc.pricing.extract.batch.constants.PricingExtractConstants;
import com.usaa.bank.card.cc.pricing.extract.batch.model.AuditInfoExtract;
import com.usaa.bank.card.cc.pricing.extract.batch.service.SftpConnectionService;
import com.usaa.bank.card.cc.pricing.extract.batch.util.BankCreditCardPricingBatchCommonDateFormatter;
import com.usaa.bank.card.cc.pricing.extract.batch.util.BankCreditCardPricingBatchCommonDateFornatter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.springframework.batch.core.ExitStatus.COMPLETED;


@SLF4j
@Component
public class UpdateAuditInfoFileWriter implements StepExecutionListener, ItemWriter<AuditInfoExtract> {
    private static final String FILE_EXTENSION = ".txt";
    @AUtowired
    private SftpConnectionService sftpConnectionservice;
    @Value("AuditInfo")
    private String extractFileName;
    @Value("/SendPricingDetailsFiles")
    private String hostFilePath;
    private int validCount = 0;
    private int existingtoUnt = 0;
    StringBuilder existingtontent = new StringBuilder("");

    @Beforestep
    public void beforeStep(StepExecution stepExecUtion) {
        log.debug("PricingExtractFilelWn iter beforeStep");
        openConnection();
        try {
            ByteArray0utputStream outputstream = new ByteArrayoutputstream();
            String file = getExtractFile();
            // Sting file =extractFileName;
            getChannelSftp().get(file, outputStream);
            existingContent.append(outputStream);
        } catch (SftpException e) {
            log.error(e.getMessage());
        } catch (JSchException e) {
            log.error(e.getMessage());
        }
            existingCount = getNo0fLinesFile(existingContent.toString());
            try {
                displayHeader(getNo0fLinesFile(existingContent.tostring()));
            } catch (Exception e) {
                log.error(e.getMessage());
            }
                String lasttine = getLastLineFile(existingContènt.toString());
                if (LastLine.startsWith(PricingExtractConstants.EXTRACT_0UTPUTFILE_TRAILER)) {
                    existingContent = new StringBuilder(removeLastLineFile(existingContent.toString()));
                }
            }
            public int getNo0fLinesFile (String content){
                if (content == null || content.isEmpty()) {
                    return 0;
                }
                String[] lines = content.split("\r\n|l\rl\n");
                return lines.length;
            }
            public String getLastLineFile (String content){
                if (content == null || content.isEmpty()) {
                    return null;
                }
                String[] lines = content.split("\r\nl\rl\n");
                return lines[lines.length - 1];
            }
            public String removeLastLineFile (String content){
                if (content == null || content.isEmpty()) {
                    return null;
                }
                String[] lines = content.split("\r\n \r\n");
                StringBuilder temp = new StringBuilder("");
                for (int i = 0; i <= lines.length - 2; i++) {
                    temp.append(lines[i]).append("\n");
                }
                    return temp.toString();
                }
                @AfterStep
                public ExitStatus afterStep(StepExecution stepExecution){
                    DecimalFormat formatCount = new DecimalFormat(PricingExtractConstants.DECIMAL_FORMAT);
                    int totalCount = existingCount + validCount;
                    String count = formatCount.format(totalCount);
                    String lastLine = getLastLineFile(existingContent.toString());
                    if (!lastLine.startsWith(PricingExtractConstants.EXTRACT_oUTPUTFILE_TRAILER)) {
                        existingContent.append((PricingExtractConstants.EXTRACT_0UTPUTFILE_TRAILER));
                        existingContent.append((count));
                        existingtContent.append("\n"));
                    }
                        try (ByteArrayInputStream inputStream = new ByteArrayInpUtStream(existingContent.toString().getBytes())){
                        getChannelSftp().rm(getExtractFile());
                        getChannelSftp().put(inputStream,getExtractFile());
                    } catch (JSchException e){
                            log.error(e.getMessage());
                        } catch(SftpException | IOException e) {
                            log.error(e.getMessage());
                        }
                        sftpConnectionservice.closeSFTPConnection();
                        log.info("After step in Filelliter");
                        retunn Exitstatus.COMPLETED;
                    }
                    private String getExtractFile() {
                        StringBuilder fileName = new StringBuilder();
                        fileName.append(extractFileName);
                        log.info("File name is{}", extractFileName);
                        fileName.append(FILE_EXTENSION);
                        log.info(hostFile Path + "/" + fileName);
                        return hostFilePath + "/" + fileName;
                    }
                        private ChannelSftp getChannelSftp() throws JSchException {

                        return sftpConnectionService.getChannelSftp();
                    };
                        private void openConnection() {
                            sftpConnectionService.openSFTPConnection();
                        }
                        @Override
                        public void write(Chunk<? extends AuditInfoExtract> chunk) {
                            try {
                                if (!CollectionUtils.isEmpty(chunk.getItems())) {
                                    List<? extends AUditInfoExtract> items = chunk.getItems();
                                    for(AuditInfoExtract item:items) {
                                        if (item != null) {
                                            String output = item.toString();
                                            existingtontent.append(output);
                                            validCount++;
                                        } else {
                                            log.info("Error output:" + item.toString());
                                        }
                                    }
                                }

                        } catch(Exception e){

                            log.error(e.getMessage());
                        }
                        log.info("Count of records inserted:" + validCount);
                    }
                        private void displayHeader(int noOfLines) {
                            Calendar calendarInstance = Calendar.getInstance();
                            calendarInstance.add(Calendar.MONTH,  -1);
                            calendarInstance.set(Calendar.DATE, calendarInstance.getActualMaximum (Calendar.DATE));
                            Date date = calendarInstance.getTime();
                            String dt= BankCreditCardPricingBatchCommonDateFormatter.formatDate(PricingExtractConstants.DATE_FORMAT, date);
                            if (noOfLines < 1) {
                                existingContent.append(PricingExtractConstants.EXTRACT_OUTFILE_HEADER);
                                existingContent.append(dt);
                                existingContent.append("\n");

                            }
                        }
            }
