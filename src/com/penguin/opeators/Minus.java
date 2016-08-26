package com.penguin.opeators;

import java.util.function.BinaryOperator;

public class Minus extends Operator
{

    @Override
    public Integer result()
    {
        return arguments.stream().reduce(minus()).orElse(0);
    }

    private BinaryOperator<Integer> minus()
    {
        return (integer, integer2) -> integer - integer2;
    }
}
