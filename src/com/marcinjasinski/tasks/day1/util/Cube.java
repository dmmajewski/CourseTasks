package com.marcinjasinski.tasks.day1.util;

import java.util.Random;

/**
 * @author Marcin Jasinski <mkjasinski@gmail.com>
 */
public class Cube {
    protected int min;
    protected int max;
    protected Random random;

    /**
     * Constructor
     *
     * @param min min value
     * @param max max value
     */
    public Cube(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    /**
     * @return int
     */
    public int getMin() {
        return min;
    }

    /**
     * @return int
     */
    public int getMax() {
        return max;
    }

    /**
     * @param min min value
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @param max max value
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * @return int
     */
    public int getRandomInt() {
        return random.nextInt((this.max - this.min) + 1) + this.min;
    }
}
