package ru.techcoll.algorithm;

/**
 * Бинарная операция над аргументами произвольного типа.
 */
public interface BinaryOperation<T> {

    public T apply(final T lhs, final T rhs);

}
