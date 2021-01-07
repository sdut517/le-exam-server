package com.leexam.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author 窦康泰
 * @date 2021/01/07
 */
@Configuration
public class Config extends WebMvcConfigurationSupport {
    @Override
    protected void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToDateConverter());
    }
}
