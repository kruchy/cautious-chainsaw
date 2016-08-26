package com.penguin.opeators;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MinusTest
{
    private Minus minus;

    @Before
    public void setUp()
    {
        this.minus = new Minus();
    }

    @Test
    public void shouldPass_positive_negative()
    {
        Integer a = -5;
        Integer b = 6;

        minus.withArguments(a, b);

        assertThat(minus.result(), is(equalTo(-11)));
    }

    @Test
    public void shouldPass_negative_negative()
    {
        Integer a = -5 ;
        Integer b = - 100;

        assertThat(minus.withArguments(a,b).result(),is(equalTo(95)));
    }

}