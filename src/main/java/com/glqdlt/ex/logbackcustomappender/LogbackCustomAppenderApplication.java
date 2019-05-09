package com.glqdlt.ex.logbackcustomappender;

import com.glqdlt.ex.logbackcustomappender.audit.AuditComponents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackCustomAppenderApplication implements CommandLineRunner {

    @Autowired
    private SomeComponents someComponents;

    @Autowired
    private AuditComponents auditComponents;

    public static void main(String[] args) {
        SpringApplication.run(LogbackCustomAppenderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        someComponents.echo();
        someComponents.throwsErr();
        auditComponents.auditEcho();;
    }
}
