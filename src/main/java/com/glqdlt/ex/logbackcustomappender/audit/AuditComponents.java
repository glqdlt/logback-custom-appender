package com.glqdlt.ex.logbackcustomappender.audit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * ch.qos.logback.classic.db.script 의 스크립트 사용하면 됨
 * @author Jhun
 * 2019-05-09
 */
@Slf4j
@Component
public class AuditComponents {

    public void auditEcho(){
        log.info("audit!!");
    }
}
