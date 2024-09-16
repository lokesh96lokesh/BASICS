package com.usaa.bank.card.cc.pricing.extract.batch.model;

import com.usaa.bank.card.cc.pricing.extract.batch.data.AuditInfoDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
@Component
@Mapper (componentModel = "spring")
public interface AuditInfoDOMapper {

@Mapping(target = "transactionId", source = "transactionId")
@Mapping(target = "partyId", source = "partyId")
@Mapping(target = "partyIdTypeCode", source = "partyIdTypeCode")
@Mapping (target = "auditRecordCreateTS", source = "auditRecordCreationTs")
@Mapping (target = "pricingOperationName", source = "pricingOperationName")
@Mapping (target = "auditActionText", source = "auditActionTxt")
@Mapping (target = "newRecordValue", source = "newRecordValue")
@Mapping(target = "oldRecordValue", source = "oldRecordValue")
@Mapping(target = "pricingItemName", source = "pricingItemName")
AuditInfoExtract mapToData(AuditInfoDetails auditInfoDetails);
}