package com.example.java.generics.shopping;

public class Pair<E>
{
    E right;
    E left;

    public Pair(E right, E left) {
        this.right = right;
        this.left = left;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E right) {
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "right=" + right +
                ", left=" + left +
                '}';
    }
}
