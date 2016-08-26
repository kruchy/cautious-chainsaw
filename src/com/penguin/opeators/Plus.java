package com.penguin.opeators;

import java.util.ArrayList;
import java.util.List;

public class Plus extends Operator
{


    public Plus()
    {
        arguments = new ArrayList<>();
    }

    public Plus(List<Integer> arguments)
    {
      super(arguments);
    }

    public Plus(Integer... args)
    {
        this();
        withArguments(args);
    }
    public static Plus of(Integer... args)
    {
        return new Plus(args);
    }
    @Override
    public Integer result()
    {
        return arguments.stream().reduce(0, Integer::sum);
    }

}
