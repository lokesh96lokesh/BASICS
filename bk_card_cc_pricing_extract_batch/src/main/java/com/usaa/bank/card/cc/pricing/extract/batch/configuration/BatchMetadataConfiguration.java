package com.usaa.bank.card.cc.pricing.extract.batch.configuration;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded. EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded. EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import javax.sql.DataSource;
@Configuration
public class BatchMetadataConfiguration {
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager (dataSource2());
    }
        @Bean
        public DataSource dataSource2() {
            EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
            return embeddedDatabaseBuilder.addScript("classpath:org/springframework/batch/core/schema-drop-h2.sql")
                    .addScript("classpath:org/springframework/batch/core/schema-h2.sql")
                    .setType(EmbeddedDatabaseType.H2)
                    .build();
        }
    @Bean (name = "h2JobRepository")
    public JobRepository jobRepository(PlatformTransactionManager txManager) throws Exception { JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
        factory.setDatabaseType("H2");
        factory.setDataSource(dataSource2());
        factory.setTransactionManager(txManager);
        factory.afterPropertiesSet();
        return factory.getObject();
    }
}