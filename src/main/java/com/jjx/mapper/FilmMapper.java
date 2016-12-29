package com.jjx.mapper;

import com.jjx.bean.Film;

/**
 * FilmMapper类
 */
public interface FilmMapper {

    int insertFilm(Film film);

    Film selectByFilmId(Short filmId);
}