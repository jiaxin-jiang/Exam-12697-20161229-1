package com.jjx.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by TandTV on 2016/12/29.
 */
@Component("afterInsertFilmEvent")
@Aspect
public class AfterInsertFilmEvent {
    @After("execution(* com.jjx.service.impl.FilmServiceImpl.insertFilm(..))")
    public void afterInsertFilmEvent(){
        System.out.println("After Insert Film Data. ");
    }
}


