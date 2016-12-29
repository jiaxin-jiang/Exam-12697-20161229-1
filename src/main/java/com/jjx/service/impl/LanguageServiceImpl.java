package com.jjx.service.impl;

import com.jjx.bean.Language;
import com.jjx.mapper.LanguageMapper;
import com.jjx.service.LanguageServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by TandTV on 2016/12/29.
 */
@Component("languageService")
public class LanguageServiceImpl implements LanguageServiceI {
    @Autowired
    private LanguageMapper languageMapper;
    @Override
    public Language selectLanguageById(Byte languageId) {
        return languageMapper.selectLanguageByLanguageId(languageId);
    }
}
