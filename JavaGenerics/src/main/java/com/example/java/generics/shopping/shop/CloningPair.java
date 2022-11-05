package com.example.java.generics.shopping.shop;

import java.util.function.BiPredicate;


public class CloningPair<E extends Sized & Colored> extends Pair<E> {
    public CloningPair(E right, E left) {
        super(right, left);
    }

    public boolean matchBy(BiPredicate<E, E> test) {
        return test.test(left, right);
    }

    /**
     *
     * @param <F>
     * @param <G>
     * @return
     */
    public <F,G> boolean matches() {
        return left.getSize() == right.getSize()
                && left.getColor().equals(right.getColor());
    }

    public static <E extends Sized & Colored> boolean match(E right, E left) {
        return matchSize(right, left) && matchColor(right, left);
    }

    public static <C extends Sized & Colored> boolean matchColor(C right, C left) {
        return left.getColor().equals(right.getColor());
    }

    public static <S extends Sized & Colored> boolean matchSize(S right, S left) {
        return left.getSize() == right.getSize();
    }
}
