package com.usaa.bank.card.cc.pricing.extract.batch.dao;

import com.usaa.bank.card.cc.pricing.extract.batch.Constants.PricingExtractConstants;
import lombok.extern.sLf4j.SLF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;

@Component
@Slf4j
public class AuditInfoDetailsDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * This Method is used to Update audit info details.
     */
    public int[] updateAuditInfoDetails() {

        int[] result = new int[]{};
        try {
            result = jdbcTemplate.batchUpdate(PricingExtractConstants.EXTRACT_UPDATE.AUDITINFODETAILS_QUERY,
                    new BatchPreparedstatementSetter() {
                        @Override
                        public void setValues(PreparedStatement ps, int i) {
                        }

                        @Override
                        public int getBatchSize() {
                            return 1;
                        }
                    });
            log.info("updateAuditInfoDetailsDetails method executed and count of records updated are:" + result[0];
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return result;
    }
}

