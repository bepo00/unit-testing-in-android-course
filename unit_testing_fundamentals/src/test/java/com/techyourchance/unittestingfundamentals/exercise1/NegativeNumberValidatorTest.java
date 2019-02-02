package com.techyourchance.unittestingfundamentals.exercise1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegativeNumberValidatorTest {
    NegativeNumberValidator SUT;

    @Before
    public void setup(){
        SUT = new NegativeNumberValidator();
    }

    @Test
    public void testNegatives(){
        Assert.assertTrue(SUT.isNegative(-1));
        Assert.assertTrue(SUT.isNegative(-1000));
        Assert.assertTrue(SUT.isNegative(-99999));
    }

    @Test
    public void testZero(){
        Assert.assertFalse(SUT.isNegative(0));
    }

    @Test
    public void testPositive(){
        Assert.assertFalse(SUT.isNegative(1));
        Assert.assertFalse(SUT.isNegative(99999));
    }
}