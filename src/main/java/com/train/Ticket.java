package com.train;

public class Ticket {

    private int tickets;
    private int roundTrip;

    public Ticket(int tickets, int roundTrip) {
        this.tickets = tickets;
        this.roundTrip = roundTrip;
    }

    public void Fees() {
        int total;
        total = ((tickets - roundTrip) * 1000) + (roundTrip * RoundTripFee(0.9f));
        String printTotal = "Total tickets: " + tickets + "\nRound-trip: " + roundTrip +
                "\nTotal: " + total;
        System.out.println(printTotal);
    }

    private int RoundTripFee(float discount) {
        int discountFees;
        discountFees = Math.round(2000 * discount);
        return discountFees;
    }

}
