package com.penguin.opeators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Plus
{


    private List<Integer> arguments;
    private Integer result;

    public Plus()
    {
        arguments = new ArrayList<>();
    }

    public Plus(List<Integer> arguments)
    {
        this.arguments = arguments;
    }

    public Plus(Integer... args)
    {
        this();
        addArgs(args);
    }

    public void addArgs(Integer... args)
    {
        Arrays.stream(args)
                .filter(Objects::nonNull)
                .forEach(arguments::add);
    }

    public Integer getResult()
    {
        return arguments.stream().reduce(0, Integer::sum);
    }

    public static Plus of(Integer... args)
    {
        return new Plus(args);
    }
}
