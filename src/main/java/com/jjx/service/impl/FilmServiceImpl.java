package com.jjx.service.impl;

import com.jjx.bean.Film;
import com.jjx.mapper.FilmMapper;
import com.jjx.service.FilmServiceI;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by TandTV on 2016/12/29.
 */
@Component("filmService")
public class FilmServiceImpl implements FilmServiceI {
    @Autowired
    private FilmMapper filmMapper;
    @Override
    public Film selectFilmById(Short filmId) {
        return filmMapper.selectByFilmId(filmId);
    }
    @Override
    @Pointcut
    public int insertFilm(Film film) {
        return filmMapper.insertFilm(film);
    }
}
