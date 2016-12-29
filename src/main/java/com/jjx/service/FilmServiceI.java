package com.jjx.service;

import com.jjx.bean.Film;

/**
 * Created by TandTV on 2016/12/29.
 */
public interface FilmServiceI {
    public Film selectFilmById(Short filmId);
    public int insertFilm(Film film);
}
