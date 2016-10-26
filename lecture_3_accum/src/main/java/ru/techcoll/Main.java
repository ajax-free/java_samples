package ru.techcoll;

import ru.techcoll.algorithm.Algorithm;
import ru.techcoll.algorithm.BinaryOperation;

import java.util.Arrays;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        final Collection<Integer> items = Arrays.asList(1, 2, 3, 4, 5);

        Integer result = Algorithm.accumulate(items, 0, new BinaryOperation<Integer>() {
            public Integer apply(Integer lhs, Integer rhs) {
                return lhs + rhs;
            }
        });

        System.out.println(result);
    }
}
