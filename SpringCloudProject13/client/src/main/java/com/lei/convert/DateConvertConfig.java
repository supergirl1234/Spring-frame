package com.lei.convert;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class DateConvertConfig {

    @Bean
    @Autowired
    public ConversionService getConversionService(DateConvert dateConvert){
        ConversionServiceFactoryBean factoryBean=new ConversionServiceFactoryBean();
        Set<DateConvert> dateConvertSet=new HashSet<>();
        dateConvertSet.add(dateConvert);
        factoryBean.setConverters(dateConvertSet);
        return factoryBean.getObject();

    }

}
