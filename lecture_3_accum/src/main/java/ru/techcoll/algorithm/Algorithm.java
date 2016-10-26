package ru.techcoll.algorithm;


import java.util.Collection;

/**
 * Класс-контейнер для алгоритмо
 */
public class Algorithm {

    public static <T> T accumulate(final Collection<T> items, final T init, final BinaryOperation<T> op) {
        T result = init;

        for (final T item : items)
            result = op.apply(result, item);

        return result;
    }

}
