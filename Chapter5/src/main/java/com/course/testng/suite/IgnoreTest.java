package com.course.testng.suite;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ingore1()...执行了");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ingore2()...执行了");
    }

    @Test
    @Ignore
    public void ignore3(){
        System.out.println("ingore3()...执行了");
    }
}
