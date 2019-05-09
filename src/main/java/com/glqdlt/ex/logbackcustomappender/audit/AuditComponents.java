package com.glqdlt.ex.logbackcustomappender.audit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
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
