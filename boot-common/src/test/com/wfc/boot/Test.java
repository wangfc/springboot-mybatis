package com.wfc.boot;


import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

public class Test {


    @org.junit.Test
    public void test(){
        try {
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            resolver.getResources("classpath:mapper/*Mapper.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
