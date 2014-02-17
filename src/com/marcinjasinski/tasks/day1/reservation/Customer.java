package com.marcinjasinski.tasks.day1.reservation;

/**
 * @author Marcin Jasinski <mkjasinski@gmail.com>
 */
public class Customer {
    private String name;
    private String address;
    private Trip trip;

    /**
     * Constructor
     *
     * @param name customer name
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Sets address
     *
     * @param address customer address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets trip
     *
     * @param trip customer trip
     */
    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    /**
     * Returns object description
     *
     * @return String
     */
    public String getInfo() {
        return "name: " + name + ", address: " + address + ", trip: " + trip.getInfo();
    }
}
