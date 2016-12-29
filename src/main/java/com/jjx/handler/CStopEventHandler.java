package com.jjx.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by TandTV on 2016/12/29.
 */
@Component("cStopEventHandler")
public class CStopEventHandler
        implements ApplicationListener<ContextStoppedEvent> {
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("Context Stop");
    }
}
