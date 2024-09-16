package com.usaa.bank.card.cc.pricing.extract.batch.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation. Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
@Slf4j
@Configuration
@Component
public class DataSourceConfiguration {
    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("dataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean("dataSource")
    public HikariDataSource dataSource() {
        return new HikariDataSource((HikariConfig) dataSourceConfig());
    }

    @Bean
    @Primary
    public HikariConfig dataSourceConfig() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:db2://testudba145lsat:53090/BKCCPRDR");
        config.setDriverClassName("com.ibm.db2.jcc.DB2Driver");
        config.setUsername("bkpnpnm");
        config.setPassword("Qm3Kuht0");
        return config;
    }
}