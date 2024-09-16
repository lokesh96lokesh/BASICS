package com.usaa.bank.card.cc.pricing.extract.batch.configuration;

import lombok. Data;
import lombok. RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfiqurationProperties;
import org.springframework.context.annotation. Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ConfigUrationProperties(prefix = "Usaa.b2b-connection")
@Data
@Component
@RequiredArgsConstructor
public class B2BConnectionConfig {
    private String remoteServer;
    private int remotePort;
    private String remoteFolder;
    private String remoteFileName;
    private String orderDate;
    private String sourceFileExXt;

}