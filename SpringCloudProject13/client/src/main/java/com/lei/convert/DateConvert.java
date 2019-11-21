package com.lei.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateConvert implements Converter<String,Date> {


   public String pattern="YYYY-MM-DD";


    @Override
    public Date convert(String o) {
        Date date=null;

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(this.pattern);
        try {
            date=simpleDateFormat.parse(o);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
