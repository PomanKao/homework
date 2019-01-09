package com.train;

public class Ticket {

    private int ticketFee;
    private int roundTripFee;
    private int tickets;
    private int roundTrip;

    public Ticket(int tickets, int roundTrip) {
        this.tickets = tickets;
        this.roundTrip = roundTrip;
        ticketFee = 1000;
        roundTripFee = 2000;
    }

    public void fees() {
        int total;
        total = ((tickets - roundTrip) * ticketFee) + (roundTrip * RoundTripFee(0.9f));
        String printTotal = "Total tickets: " + tickets + "\nRound-trip: " + roundTrip +
                "\nTotal: " + total;
        System.out.println(printTotal);
    }

    private int RoundTripFee(float discount) {
        int discountFees;
        discountFees = Math.round(roundTripFee * discount);
        return discountFees;
    }

}
