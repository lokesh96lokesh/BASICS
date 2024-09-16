package com.usaa.bank.card.cc.pricing.extract.batch.reader;

import com.usaa.bank.card.cc.pricing.extract.batch.configuration.DataSourceConfiguration;
import com.usaa.bank.card.cc.pricing.extract.batch.constants.PricingExtractConstants;
import com.usaa.bank.card.cc.pricing.extract.batch.data.AuditInfoDetails;
import com.usaa.bank.card.cc.pricing.extract.batch.model.AuditInfoMapper;
import lombok.extern.slf4j.slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@SLF4J
@Component
public class UpdateAuditInfoJdbcReader implements StepExecutionListener {
    @Autowired
    private DataSourceConfiguration dataSourceConfiguration;

    @Bean("extractUpdateAuditInfoReader")
    public JdbcCursorItemReader<AuditInfoDetails> reader() {
        JdbcCursorItemReader<AuditInfoDetails> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(dataSourceConfiguration.dataSource());
        reader.setSql(PricingExtractConstants.EXTRACT_SELECT_AUDITINFODETAILS_QUERY);
        reader.setRowMapper(new Audit InfoMapper());
        return reader;
    }

    @Override
    public void beforeStep(StepExecution stepExecution) {
        log.info("AuditInfoExtract reading process started");
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        log.info("Audit InfoExtract reading process ended");
        return null;
    }
}