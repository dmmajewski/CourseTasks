package com.marcinjasinski.tasks.day1;

import com.marcinjasinski.tasks.day1.reservation.Customer;
import com.marcinjasinski.tasks.day1.reservation.Trip;
import com.marcinjasinski.tasks.day1.util.Date;

/**
 * @author Marcin Jasinski <mkjasinski@gmail.com>
 */
public class TravelOffice {
    /**
     * Main method
     *
     * @param args array of arguments
     */
    public static void main(String[] args) {
        Customer customer = new Customer("Martin");
        Trip trip = new Trip(new Date(2014, 12, 12), new Date(2014, 12, 26), "description");
        customer.assignTrip(trip);

        System.out.format("%s", customer.getInfo());
    }
}
