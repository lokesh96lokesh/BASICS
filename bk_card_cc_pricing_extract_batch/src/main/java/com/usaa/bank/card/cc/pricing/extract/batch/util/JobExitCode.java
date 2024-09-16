package com.usaa.bank.card.cc.pricing.extract.batch.util;

import Lombok.Getter ;
import lombok. Setter;
public class JobExitCode {
    private static final JobExitCode instance = new JobExitCode();
    @Getter
    @Setter
    private ExitCode exitCode = ExitCode.COMPLETED;

    private JobExitCode() {
    }

    public static JobExitCode getInstance() {
        return instance;
    }
}