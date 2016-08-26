package com.penguin.opeators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Operator
{
    protected List<Integer> arguments;
    private Integer result;

    public Operator()
    {
        arguments = new ArrayList<>();
    }

    public Operator(List<Integer> arguments)
    {
        this.arguments = arguments;
    }

    public Operator withArguments(Integer... args)
    {
        Arrays.stream(args)
                .filter(Objects::nonNull)
                .forEach(arguments::add);
        return this;
    }

    public abstract Integer result();
}
