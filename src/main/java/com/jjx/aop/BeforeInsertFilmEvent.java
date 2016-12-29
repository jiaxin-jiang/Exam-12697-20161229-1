package com.jjx.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by TandTV on 2016/12/29.
 */
@Component("beforeInsertFilmEvent")
@Aspect
public class BeforeInsertFilmEvent {
    @Before("execution(* com.jjx.service.impl.FilmServiceImpl.insertFilm(..))")
    public void beforeInsertFilmEvent(){
        System.out.println("Before Insert Film Data. ");
    }
}
