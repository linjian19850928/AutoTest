package com.course.testng.suite;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("testSuccess..执行了...");
    }

    @Test(timeOut = 3000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("testSuccess..执行了...");
    }
}
