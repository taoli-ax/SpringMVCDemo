package com.coh.controller.date;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert implements Converter<String, Date> {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("yyyy/MM/dd");
    Date date;
    @Override
    public Date convert(String s) {
        try {
            date=simpleDateFormat.parse(s);
        }catch (Exception e){
            try {
                date=simpleDateFormat2.parse(s);
            } catch (ParseException ex) {
                e.printStackTrace();
            }

        }

        return date;
    }
}
