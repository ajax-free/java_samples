package ru.techcoll.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class AlgorithmTest {

    @Test
    public void sum() throws Exception {

        final Collection<Integer> items = Arrays.asList(1, 2, 3, 4, 5);

        Integer result = Algorithm.accumulate(items, 0, new BinaryOperation<Integer>() {
            public Integer apply(Integer lhs, Integer rhs) {
                return lhs + rhs;
            }
        });

        assertEquals(15, (int)result);

    }

    @Test
    public void sumLambda() throws Exception {

        final Collection<Integer> items = Arrays.asList(1, 2, 3, 4, 5);

        Integer result = Algorithm.accumulate(items, 0, (lhs, rhs) -> lhs + rhs);

        assertEquals(15, (int)result);

    }

    @Test
    public void mul() throws Exception {

        final Collection<Integer> items = Arrays.asList(1, 2, 3, 4, 5);

        Integer result = Algorithm.accumulate(items, 1, new BinaryOperation<Integer>() {
            public Integer apply(Integer lhs, Integer rhs) {
                return lhs * rhs;
            }
        });

        assertEquals(120, (int)result);

    }

    @Test
    public void mulLambda() throws Exception {

        final Collection<Integer> items = Arrays.asList(1, 2, 3, 4, 5);

        Integer result = Algorithm.accumulate(items, 1, (lhs, rhs) -> lhs * rhs);

        assertEquals(120, (int)result);

    }

    @Test
    public void concat() throws Exception {

        final Collection<String> items = Arrays.asList("abc", "def", "ijk", "lmn");

        String result = Algorithm.accumulate(items, "", new BinaryOperation<String>() {
            public String apply(String lhs, String rhs) {
                return lhs + rhs;
            }
        });

        assertEquals("abcdefijklmn", result);

    }

    @Test
    public void concatLambda() throws Exception {

        final Collection<String> items = Arrays.asList("abc", "def", "ijk", "lmn");

        String result = Algorithm.accumulate(items, "", (lhs, rhs) -> lhs + rhs);

        assertEquals("abcdefijklmn", result);

    }

}