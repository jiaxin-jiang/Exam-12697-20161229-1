package com.jjx.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by TandTV on 2016/12/29.
 */
@Component("cStartEventHandler")
public class CStartEventHandler
        implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("Context Start");
    }
}
