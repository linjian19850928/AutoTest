package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod....执行了");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod....执行了");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass...执行了");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass...执行了");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite...执行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite...执行了");
    }
}
