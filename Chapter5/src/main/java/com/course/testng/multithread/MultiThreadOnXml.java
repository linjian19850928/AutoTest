package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("test1执行了.."+"Thread Id:%s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("test2执行了.."+"Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("test3执行了.."+"Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.printf("test4执行了.."+"Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test5(){
        System.out.printf("test5执行了.."+"Thread Id:%s%n",Thread.currentThread().getId());
    }
}
