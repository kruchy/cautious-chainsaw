package com.penguin.opeators;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlusTest
{

    private Plus plus;

    @Before
    public void setUp()
    {
        plus = new Plus();
    }

    @Test
    public void shouldPass_TwoPlus()
    {
        int a = 5;
        int b = 2;

        plus.withArguments(a, b);

        assertThat(plus.result(),is(equalTo(7)));
    }

    @Test
    public void shouldPass_staticPlus()
    {
        int a = 1 ;
        int b = 0;
        int c = 100;

        Plus of = Plus.of(a, b, c);
        assertThat(of.result(),is(equalTo(a+b+c)));
    }

    @Test
    public void shouldPass_null_twoPlus()
    {
        Integer b = 5;
        Integer c = 10;

        plus.withArguments(null,b,c);

        assertThat(plus.result(),is(equalTo(b+c)));
    }

    @Test
    public void shouldPass_onePlusOneMinus()
    {
        Integer a = 5;
        Integer b = -6;

        plus.withArguments(a,b);
        assertThat(plus.result(),is(equalTo(-1)));
    }


}