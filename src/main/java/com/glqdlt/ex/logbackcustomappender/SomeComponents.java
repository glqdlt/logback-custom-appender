package com.glqdlt.ex.logbackcustomappender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Jhun
 * 2019-05-09
 */
@Slf4j
@Component
public class SomeComponents {

    public void echo() {
        log.info("Hello~","음");
        log.debug("debug");
    }

    public void throwsErr() {
        try {
            throw new RuntimeException("What thu");
        } catch (RuntimeException ex) {
            log.error(ex.getMessage(), ex);
        }
    }
}
