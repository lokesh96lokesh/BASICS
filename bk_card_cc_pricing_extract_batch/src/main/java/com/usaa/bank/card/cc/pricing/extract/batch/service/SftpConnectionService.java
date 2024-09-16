package com.usaa.bank.card.cc.pricing.extract.batch.service;
import com.jcraft.jsch.*;
import com. usaa . bank. card.cc.pricing.extract.batch.configuration . B2BConnectionConfig;
import com.usaa.bank.card.cc.pricing. extract.batch.constants.PricingExtractConstants ;
import com.usaa.bank.card.cc.pricing.extract.batch.exception. ServiceException;
import com.usaa.spring.conjur.api.ConjurSecret;
import lombok . RequiredArgsConstructor;
import Lombok. extern.slf4j.SLf4j;
import org.springframework.beans.factory.annotation. Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.Properties;
@Service
@SlF4j
@RequiredArgsConstructor
public class SftpConnectionService {
    private final B2BConnectionConfig b2BConnectionConfig;
    private ChannelSftp channelSftp;
    private Session sftpSession;
    @Autowired
@Qualifier("b2bConjursSecret")
    private ConjurSecret conjursecnet;
    public Session getSftpSession() throws JSchException {
        Properties config = new Properties();
        config.put(PricingExtractConstants.STRICT_HOST_KEY_CHECKING, Pricing ExtractConstants.NO);
        JSch jSch = new JSch();
        Session session= jSch.getSession(conjurSecret.getUserName(), b2BConnectionConfig.getRemoteServer(), b2BConnectionConfig.getRemotePort();
        session.setConfig(config);
        session.setPassword (conjurSecret.getPassword());
        return session;
    }
        public void openSFTPConnection() {
            try {
                sftpSession = getSftpSession();
                log.info("Opening a session for '{}' user on the '{}' server.", conjurSecret.getUserName(), b2BConnectionConfig.getRemoteServer());
                sftpSession.connect();
                log.info("Successfully opened a session with the '{}' user on the '{}' server.", conjurSecret.getUserName(),
                        b2BConnectionConfig.getRemoteServer());
            } catch (JSchException jSchException) {
                Log.error(jSchException.getMessage());

            }
        }
            public void closeSFTPConnection() {
                if (sftpSession != null) {
                    sftpSession.disconnect();
                    log.info("SFTP session is successfully closed.");
                }
            }
            public chanelSftp getChannelSftp() throws JSchException {
    channelSftp=(ChannelSftp) sftpSession.openChannel("sftp");
    channelSftp.connect();
    return channelSftp;}
}
