package com.leexam.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 窦康泰
 * @date 2021/01/07
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
