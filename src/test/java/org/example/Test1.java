package org.example;

import org.testng.annotations.*;

public class Test1 {
    @BeforeSuite
    void beforeSuit(){
        System.out.println("before Suit");

    }
    @AfterSuite
    void afterSuit(){
        System.out.println("after Suit");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    void afterTest(){
        System.out.println("after Test");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("This will run before CLASS");
    }
    @AfterClass
    void afterClass(){
        System.out.println("This will run after CLASS");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("before METHOD");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("after METHOD");
    }
    @Test
    void test1(){
        System.out.println("TEST1");
    }
    @Test
    void test2(){
        System.out.println("TEST2");
    }
    @Test
    void test3(){
        System.out.println("TEST3");
    }
}
