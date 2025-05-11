package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    //@Parameters({"name","age"})
    @Parameters({"name","age",})
    public void paramterTest1(String name,Integer age){
        System.out.println("name= "+name+"\n"+"age= "+age);
    }
}
