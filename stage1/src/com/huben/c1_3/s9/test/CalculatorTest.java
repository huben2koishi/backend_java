package com.huben.c1_3.s9.test;

import com.huben.c1_3.s9.p1.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int result = c.add(4, 5);

        Assert.assertEquals(9, result);
    }

    @Test
    public void testSub() {
        Calculator c = new Calculator();
        int result = c.sub(4, 5);

        Assert.assertEquals(-1, result);
    }

    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close");
    }
}
