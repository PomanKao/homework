package com.train;

public class Ticket {

    int tickets;
    int roundTrip;

    public Ticket(int tickets, int roundTrip) {
        this.tickets = tickets;
        this.roundTrip = roundTrip;
    }

    public int Fees() {
        int total;
        total = (tickets * 1000) + ((tickets - roundTrip) * 1800);
        return total;
    }

}
