package com.course.testng.suite;


import org.testng.annotations.Test;


public class ExpectedException {
    @Test(expectedExceptions=RuntimeException.class)
    public void runTimeExceptionFail(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions=RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        int i = 1/0;
    }
}
