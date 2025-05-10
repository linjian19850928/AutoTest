package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("SuiteConfig.beforeSuite()...执行了...");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("SuiteConfig.afterSuite()...执行了...");
    }
}
