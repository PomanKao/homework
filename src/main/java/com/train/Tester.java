package com.train;

import java.util.Scanner;

public class Tester {
    private static boolean isExit = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        homework1(scanner);
        homework2(scanner);
    }

    private static void homework2(Scanner scanner) {
        do {
            System.out.print("Please enter number of tickets or enter -1 to end: ");
            int tickets = scanner.nextInt();
            if (tickets == -1) {
                isExit = true;
                break;
            }
            System.out.print("How many round-trip tickets or enter -1 to end: ");
            int roundTrip = scanner.nextInt();
            if (roundTrip == -1) {
                isExit = true;
                break;
            }
            Ticket ticket = new Ticket(tickets, roundTrip);
            ticket.fees();
        } while(!isExit);
        System.out.println("Thank you!");
    }

    private static void homework1(Scanner scanner) {
        System.out.print("Please enter number of tickets: ");
        int tickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundTrip = scanner.nextInt();
        Ticket ticket = new Ticket(tickets, roundTrip);
        ticket.fees();
    }
}
