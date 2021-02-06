package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int diff;

    public Randoms(int min, int max) {
        this.min = min;
        this.diff = max - min;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + random.nextInt(diff + 1);
            }

            @Override
            public void remove() {
            }
        };
    }
}
