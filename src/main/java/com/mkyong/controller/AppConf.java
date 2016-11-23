package com.mkyong.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Admin on 23.11.2016.
 */
@Configuration
@PropertySource(value = {"classpath:/prop.properties"}, ignoreResourceNotFound = true)
public class AppConf {
}