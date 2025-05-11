package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class StudentTest {
    @Test
    public void studying(){
        System.out.println("StudentTest中的studying()执行了...");
    }

    @Test
    public void eating(){
        System.out.println("StudentTest中的eating()执行了...");
    }
}
