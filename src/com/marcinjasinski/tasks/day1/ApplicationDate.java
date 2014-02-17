package com.marcinjasinski.tasks.day1;

import com.marcinjasinski.tasks.day1.util.Date;

/**
 * @author Marcin Jasinski <mkjasinski@gmail.com>
 */
public class ApplicationDate {
    /**
     * Main method
     *
     * @param args array of arguments
     */
    public static void main(String[] args) {
        Date start = new Date(1990, 10, 12);
        Date end = new Date(2005, 10, 24);

        System.out.format("%s\n%s\n", start, end);

        Date today = start;

        System.out.format("%s\n", today);

        today.setYear(1999).setDay(24);

        System.out.format("%s\n%s\n", today, start);

        end = today;

        System.out.format("%s\n", end);
    }
}
