package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class GroupsOnMethod {
    @Test(groups = {"group1"})
    public void groupsOnMethodTest1() throws Exception {
        Method method = GroupsOnMethod.class.getMethod("groupsOnMethodTest1");
        Test annotation = method.getAnnotation(Test.class);
        String[] groups = annotation.groups();
        System.out.println(method.getName()+"...执行了...该方法属于"+Arrays.toString(groups)+"组");
    }
    @Test(groups = {"group2"})
    public void groupsOnMethodTest2() throws Exception {
        Method method = GroupsOnMethod.class.getMethod("groupsOnMethodTest2");
        Test annotation = method.getAnnotation(Test.class);
        String[] groups = annotation.groups();
        System.out.println(method.getName()+"...执行了...该方法属于"+Arrays.toString(groups)+"组");
    }

    @Test(groups = {"group3"})
    public void groupsOnMethodTest3() throws Exception {
        Method method = GroupsOnMethod.class.getMethod("groupsOnMethodTest3");
        Test annotation = method.getAnnotation(Test.class);
        String[] groups = annotation.groups();
        System.out.println(method.getName()+"...执行了...该方法属于"+Arrays.toString(groups)+"组");
    }

    @BeforeGroups("group3")
    public void beforeGroupsTest() throws Exception {
        Method method = GroupsOnMethod.class.getMethod("beforeGroupsTest");
        BeforeGroups annotation = method.getAnnotation(BeforeGroups.class);
        String[] beforeGroups = annotation.value();
        System.out.println(method.getName()+"方法,在"+Arrays.toString(beforeGroups)+"组中的方法执行前...执行了");

    }
    @AfterGroups("group3")
    public void afterGroupsTest() throws Exception {
        Method method = GroupsOnMethod.class.getMethod("afterGroupsTest");
        AfterGroups annotation = method.getAnnotation(AfterGroups.class);
        String[] beforeGroups = annotation.value();
        System.out.println(method.getName()+"方法,在"+Arrays.toString(beforeGroups)+"组中的方法执行后...执行了");

    }


}
