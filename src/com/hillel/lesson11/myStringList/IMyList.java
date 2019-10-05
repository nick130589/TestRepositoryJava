package com.hillel.lesson11.myStringList;

public interface IMyList<T> {
    void add(T value);
    int size();
    void clean();
    T get(int index);
    void print();
}
