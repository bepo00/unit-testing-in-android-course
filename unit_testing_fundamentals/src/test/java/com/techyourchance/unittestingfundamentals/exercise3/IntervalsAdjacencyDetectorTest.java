package com.techyourchance.unittestingfundamentals.exercise3;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class IntervalsAdjacencyDetectorTest {
    IntervalsAdjacencyDetector SUP;

    @Before
    public void setUp() {
        SUP = new IntervalsAdjacencyDetector();
    }

    @Test
    public void isAdjacent_interval1BeforeInterval2_returnFalse() {
        Interval interval1 = new Interval(0,1);
        Interval interval2 = new Interval(3,5);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_interval1AfterInterval2_returnFalse() {
        Interval interval1 = new Interval(3,5);
        Interval interval2 = new Interval(0,1);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_interval1ContainedInInterval2_returnFalse() {
        Interval interval1 = new Interval(5,7);
        Interval interval2 = new Interval(3, 10);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_interval1ContainsInterval2() {
        Interval interval1 = new Interval(1,9);
        Interval interval2 = new Interval(2,8);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_interval1OverlapsInterval2OnStart_returnFalse() {
        Interval interval1 = new Interval(0, 5);
        Interval interval2 = new Interval(3,7);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_interval1OverlapsInterval2OnEnd_returnFalse() {
        Interval interval1 = new Interval(5,9);
        Interval interval2 = new Interval(3,7);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_interval1AdjacentBeforeInterval2_returnTrue() {
        Interval interval1 = new Interval(1,3);
        Interval interval2 = new Interval(3,5);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isAdjacent_interval1AdjacentAfterInterval2_returnTrue() {
        Interval interval1 = new Interval(3,5);
        Interval interval2 = new Interval(1,3);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isAdjacent_interval1SameAsInterval2_returnFalse() {
        Interval interval1 = new Interval(3,5);
        Interval interval2 = new Interval(3,5);
        Boolean result = SUP.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(false));
    }

    //interval1 before interval2 not overlaping, not adjecent - false
    //interval1 overlap at start interval2 false
    //interval1 overlap at end interval2 false
    //interval1 beforeinterval2adjacent true
    //interval1 afterinterval2adjacent true
}