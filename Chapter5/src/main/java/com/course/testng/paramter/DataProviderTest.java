package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "myDataProvider2")
    public void testDataProvider1(String name,Integer age){
        System.out.println("name="+name+"\nage="+age);
    }

    @Test(dataProvider = "myDataProvider2")
    public void testDataProvider2(String name,Integer age){
        System.out.println("name="+name+"\nage="+age);
    }

    @DataProvider(name ="myDataProvider1")
    public Object[][] dataProvider1(){
        return new Object[][]{
                {"linjian",40},
                {"wanghao",42},
                {"zhangmin",43}
        };
    }

    @DataProvider(name ="myDataProvider2")
    public Object[][] dataProvider2(Method method){
        if(method.getName().equals("testDataProvider1")){
            return new Object[][]{
                    {"莫迪",78},
                    {"特凉普",82}
            };
        }else{
            return new Object[][]{
                    {"马克龙",40},
                    {"石破茂",60}
            };
        }
    }
}
