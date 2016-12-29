package com.jjx;

import com.jjx.bean.Film;
import com.jjx.service.FilmServiceI;
import com.jjx.service.LanguageServiceI;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Scanner in = new Scanner(System.in);
        try {
            ac.start();
            FilmServiceI filmService = ac.getBean("filmService", FilmServiceI.class);
            LanguageServiceI languageService=ac.getBean("languageService",LanguageServiceI.class);
            Film film = new Film();
            System.out.println("请输入电影名称(title):");
            film.setTitle(in.nextLine());
            System.out.println("请输入电影描述(description):");
            film.setDescription(in.nextLine());
            System.out.println("请输入语言 ID(language_id):");
            Byte languageId = in.nextByte();
            if (languageService.selectLanguageById(languageId)!=null){
                film.setLanguageId(languageId);
                filmService.insertFilm(film);
                ac.stop();
            }else {
                System.out.println("语言 ID不存在");
            }
        } catch (InputMismatchException exception) {
            System.out.println("您输入的语言ID有误！");
        }
    }
}