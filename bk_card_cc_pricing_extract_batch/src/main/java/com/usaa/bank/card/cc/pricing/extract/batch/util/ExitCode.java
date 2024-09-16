package com.usaa.bank.card.cc.pricing.extract.batch.util;

public enum ExitCode {
    COMPLETED (0),
    FAILED(1);
    private final int code;
    ExitCode(int code) { this.code = code;}
        public int getCode() { return code; }
    }
