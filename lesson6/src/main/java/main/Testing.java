package main;

import main.annotations.AfterSuite;
import main.annotations.BeforeSuite;
import main.annotations.Test;

public class Testing {

    @BeforeSuite
    public void prepare() {
        System.out.println("BEFORE");
    }

    @Test(priority = Test.Priority.LOWEST)
    public void test1() {
        System.out.println("test 10");
    }

    @Test(priority = Test.Priority.MAX_PRIORITY)
    public void test2() {
        System.out.println("test 1");
    }

    @Test
    public void test3() {
        System.out.println("test 5");
    }

    @Test(priority = Test.Priority.HIGHEST)
    public void test4() {
        System.out.println("test 2");
    }

    @Test(priority = Test.Priority.HIGH)
    public void test5() {
        System.out.println("test 4");
    }

    @Test(priority = Test.Priority.VERY_HIGH)
    public void test6() {
        System.out.println("test 3");
    }

    @Test(priority = Test.Priority.HIGHER)
    public void test7() {
        System.out.println("test 6");
    }

    @Test(priority = Test.Priority.LOW)
    public void test8() {
        System.out.println("test 8");
    }

    @Test(priority = Test.Priority.LOWER)
    public void test9() {
        System.out.println("test 7");
    }

    @Test(priority = Test.Priority.VERY_LOW)
    public void test10() {
        System.out.println("test 9 ");
    }

    @AfterSuite
    public void cleanUp() {
        System.out.println("AFTER");
    }
}