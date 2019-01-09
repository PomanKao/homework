package com.train

import java.util.*

var isExit: Boolean = false

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
//    homework1(scanner)
    homework2(scanner)
}

fun homework2(scanner: Scanner) {
    do {
        print("Please enter number of tickets or enter -1 to end: ")
        val tickets = scanner.nextInt()
        if (tickets == -1) {
            isExit = true
            break
        }
        print("How many round-trip tickets or enter -1 to end: ")
        val roundTrip = scanner.nextInt()
        if (roundTrip == -1) {
            isExit = true
            break
        }
        val ticket = TicketKotlin(tickets, roundTrip)
        ticket.fees()
    } while (!isExit)
    println("Thank you!")
}

private fun homework1(scanner: Scanner) {
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