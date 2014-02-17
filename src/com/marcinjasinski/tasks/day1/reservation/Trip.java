package com.marcinjasinski.tasks.day1.reservation;

import com.marcinjasinski.tasks.day1.util.Date;

/**
 * @author Marcin Jasinski <mkjasinski@gmail.com>
 */
public class Trip {
    private Date start;
    private Date end;
    private String description;

    /**
     * Constructor
     *
     * @param start       start date
     * @param end         end date
     * @param description trip description
     */
    public Trip(Date start, Date end, String description) {
        this.start = start;
        this.end = end;
        this.description = description;
    }

    /**
     * Returns object description
     *
     * @return String
     */
    public String getInfo() {
        return start.getInfo() + ", " + end.getInfo() + ", description: " + description;
    }
}
