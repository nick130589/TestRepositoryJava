package com.hillel.lesson11.myStringList;

public class MyIntegerListImpl implements IMyList<Integer> {

    private Integer[] array = new Integer[0];

    @Override
    public void add(Integer value) {
        Integer[] arrayTarget = new Integer[array.length + 1];
        System.arraycopy(array, 0, arrayTarget, 0, array.length);
        array = arrayTarget;
        array[array.length - 1] = value;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clean() {

    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public void print() {

    }
}
