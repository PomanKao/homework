package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()
    val ticket = TicketKotlin(tickets, roundTrip)
    ticket.fees()
}

class TicketKotlin(var tickets: Int, var roundTrip: Int) {
    private val ticketFee = 1000
    private val roundTripFee = 2000

    fun fees() {
        val total = ((tickets - roundTrip) * ticketFee) + (roundTrip * discountRoundTrip(0.9f))
        println("Total tickets: $tickets\nRound-trip: $roundTrip\nTotal: $total")
    }

    private fun discountRoundTrip(discount: Float): Int {
        val discountFee = roundTripFee * discount
        return discountFee.toInt()
    }
}