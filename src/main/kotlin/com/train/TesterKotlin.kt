package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()
    val ticket = TicketKotlin(tickets, roundTrip)
    ticket.Fees()
}

class TicketKotlin(var tickets: Int, var roundTrip: Int) {

    fun Fees() {
        val total = ((tickets - roundTrip) * 1000) + (roundTrip * discountRoundTrip(0.9f))
        println("Total tickets: $tickets\nRound-trip: $roundTrip\nTotal: $total")
    }

    private fun discountRoundTrip(discount: Float): Int {
        val discountFee = 2000 * discount
        return discountFee.toInt()
    }
}