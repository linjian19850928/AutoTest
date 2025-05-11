package com.course.testng.suite;

import org.testng.annotations.Test;

public class DependTest {

    /**
     * test2 依赖 test1
     * test1执行通过了 再执行test2
     * 如果test1 未执行,或者执行未通过,则test2不执行
     */
    @Test
    public void test1(){
        int i = 1/0;
        System.out.println("test1()...执行了...");
    }
    @Test(dependsOnMethods ={"test1"} )
    public void test2(){
        System.out.println("test2()...执行了...");
    }
}
