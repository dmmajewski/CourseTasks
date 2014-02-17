package com.marcinjasinski.tasks.day1.util;

/**
 * @author Marcin Jasinski <mkjasinski@gmail.com>
 */
public class Date {
    private int day;
    private int month;
    private int year;

    /**
     * Constructor
     *
     * @param year  year in date
     * @param month month in date
     * @param day   day in date
     */
    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Returns day from date
     *
     * @return int
     */
    public int getDay() {
        return day;
    }

    /**
     * Returns month from date
     *
     * @return int
     */
    public int getMonth() {
        return month;
    }

    /**
     * Returns year from date
     *
     * @return int
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets day in date
     *
     * @param day day in date
     * @return Date
     */
    public Date setDay(int day) {
        this.day = day;

        return this;
    }

    /**
     * Sets month in date
     *
     * @param month month in date
     * @return Date
     */
    public Date setMonth(int month) {
        this.month = month;

        return this;
    }

    /**
     * Sets year in date
     *
     * @param year year in date
     * @return Date
     */
    public Date setYear(int year) {
        this.year = year;

        return this;
    }

    @Override
    public String toString() {
        return "day=" + day + ", month=" + month + ", year=" + year;
    }

    /**
     * Returns object description
     *
     * @return String
     */
    public String getInfo() {
        return toString();
    }
}
