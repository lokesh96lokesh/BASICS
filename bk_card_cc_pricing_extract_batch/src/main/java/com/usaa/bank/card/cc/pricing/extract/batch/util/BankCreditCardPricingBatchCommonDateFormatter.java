package com.usaa.bank.card.cc.pricing.extract.batch.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
public class BankCreditCardPricingBatchCommonDateFormatter {
/**
        * Format the input date using a formatter having the pattern provide d.
            * The pattern should be one of the patterns defined bu this class.
            * <tt>null</tt> will be retUrned if the pattern is not defined within
* this class, Or if the input date is ctt>nUll</tt>
    ODaram pattern the Dattern into Which the date object should be
            formatted
    Oparan date the date instance to format
    @return String containing the formatted date or null*/
    public static String formatDate (String pattern, Date date) {
        String formattedDate = null;
        SimpleDateFormat formatter = null;
        if (!Objects.isNull(pattern) && !pattern.isEmpty()) {
            formatter = new SimpleDateFormat(pattern);
        }
        if (formatter != null && date != null) {
            formattedDate = formatter.format(date);
        }
        return formattedDate;
    }
}