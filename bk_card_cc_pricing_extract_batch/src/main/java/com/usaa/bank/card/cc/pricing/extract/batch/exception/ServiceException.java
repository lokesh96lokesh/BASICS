package com.usaa.bank.card.cc.pricing.extract.batch.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ServiceException(String format, Object... data) {
        super(safeFormat(format, data));
    }

    public ServiceException(Throwable cause, String format, Object... data) {
        super(safeFormat(format, data), cause);
    }

    private static String safeFormat(String format, Object... data) {
        String message = format;
        if (data != null && data.length > 0) {
            try {
                message = String.format(format, data);
            } catch (Throwable throwable) { // NOSONAR
                StringWriter sw = new StringWriter();
                sw.append("Error formatting exception: [");
                sw.append(message);
                sw.append("] data: [");
                sw.append(Arrays.deepToString(data));
                sw.append(" ] formatError: ");
                PrintWriter pw = new PrintWriter(sw);
                throwable.printStackTrace(pw);
                message = sw.toString();
            }
        }
        return message;
    }
}