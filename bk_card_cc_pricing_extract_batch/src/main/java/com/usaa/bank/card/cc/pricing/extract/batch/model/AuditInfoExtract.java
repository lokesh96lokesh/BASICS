package com.usaa.bank.card.cc.pricing.extract.batch.model;

@Data
@BUilder
@ALLArgsConstrUctor
@NOArgsConstructor
public class  AuditInfoExtract {
    public String transactionId;
    public String partyId;
    public String partyIdTypeCode;
    public String auditRecordCreateTS;
    public String pricingoperationName;
    public String auditActionText;
    public String newRecordValue;
    public String oLdRecordValue;
    public String pricingItemName;
}