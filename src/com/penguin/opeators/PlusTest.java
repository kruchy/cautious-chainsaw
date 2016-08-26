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
    public void testAdd()
    {
        int a = 5;
        int b = 2;

        plus.addArgs(a, b);

        assertThat(plus.getResult(),is(equalTo(7)));
    }

    @Test
    public void testOf()
    {
        int a = 1 ;
        int b = 0;
        int c = 100;

        Plus of = Plus.of(a, b, c);
        assertThat(of.getResult(),is(equalTo(a+b+c)));
    }

    @Test
    public void testNull()
    {
        Integer a = null;
        Integer b = 5;
        Integer c = 10;

        plus.addArgs(a,b,c);

        assertThat(plus.getResult(),is(equalTo(b+c)));
    }


}