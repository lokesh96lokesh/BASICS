package com.usaa.bank.card.cc.pricing.extract.batch.modelmapper;

import com.usaa.bank.card.cc.pricing.extract.batch.constants.PricingExtractConstants;
import com.usaa.bank.card.cc.pricing.extract.batch.model.AuditInfoExtract;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;

@component
public class AuditInfoModelMapper implements FieldSetMapper<AuditInfoExtract> {
    @Override
    public AuditInfoExtract mapFieldSet(FieldSet fieldSet) {
        AuditInfoExtract auditInfoExtract = new AuditInfoExtract();
        auditInfoExtract.setTransactionId(fieldSet.readString(PricingExtractConstants.CR_CARD_PRICE_TRAN_ID));
        auditInfoExtract.setPartyId(fieldSet.readString(PricingExtractConstants.PARTY_PD_ID));
        auditInfoExtract.setPartyIdTypeCode(fieldSet.readString(PricingExtractConstants.PARTY_ID_TYPE_CD));
        auditInfoExtract.setAuditRecordCreateTS(fieldSet.readString(PricingExtractConstants.AUDIT_RECORD_CREATE_TS));
        auditInfoExtract.setPricingOperationName(fieldSet.readString(Pricing ExtractConstants.PRICE_OPERATION_NM));
        auditInfoExtract.setPricingItemName(fieldSet.readString(Pricing ExtractConstants.PRICE_ITEM_NM));
        auditInfoExtract.setAuditActionText(fieldSet.readString(Pricing ExtractConstants.AUDIT_ACTION_TXT));
        auditInfoExtract.setOldRecordValue(fieldSet.readString(PricingExtractConstants.OLD_VALUE_TXT));
        auditInfoExtract.setNewRecordValue(fieldSet.readString(PricingExtractConstants.NEW_VALUE_TXT));


        return auditInfoExtract;

    }
}
