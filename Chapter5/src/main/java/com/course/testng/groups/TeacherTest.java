package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class TeacherTest {
    @Test
    public void teaching(){
        System.out.println("TeacherTest中的teaching()执行了...");
    }

    @Test
    public void eating(){
        System.out.println("TeacherTest中的eating()执行了...");
    }
}
