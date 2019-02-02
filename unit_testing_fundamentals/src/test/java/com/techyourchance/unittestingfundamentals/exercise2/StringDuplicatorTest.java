package com.techyourchance.unittestingfundamentals.exercise2;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {
    private StringDuplicator SUT;

    @Before
    public void setUp() {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_longString_duplicatedStringReturned() {
        String text = "Ovo je testni dugi string bla bla!";
        String result = SUT.duplicate(text);
        assertThat(result, CoreMatchers.is(text+text));
    }

    @Test
    public void duplicate_emptyString_emptyStringReturned() {
        assertEquals("", SUT.duplicate(""));
    }

    @Test
    public void duplicate_singleCharacter_twoCharactersReturned() {
        assertEquals("aa", SUT.duplicate("a"));
    }
}