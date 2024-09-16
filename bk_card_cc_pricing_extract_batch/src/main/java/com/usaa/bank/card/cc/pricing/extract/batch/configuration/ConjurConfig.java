package com.usaa.bank.card.cc.pricing.extract.batch.configuration;

import com.usaa.spring.conjur. api.ConjurSecret;
import com.usaa.spring.conjur.autoconfiguration.CredentialsFactory;
import lombok. RequiredArgsConstructor;
import org.springframework.context. annotation.Bean;
import org.springframework.context.annotation. Configuration;
@Configuration
@RequiredArgsConstructor
public class ConjurConfig {
    private final CredentialsFactory credentialsFactory;

    @Bean(name ="b2bConjurSecret")

    public ConjurSecret get(){
return credentialsFactory.getCredentials("sftp-account").block();
}
}