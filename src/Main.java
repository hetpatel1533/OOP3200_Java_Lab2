/*
* Group members name: Het Patel | Edwin Abraham
* Student ID: 100849572 | 100852671
* Group number: 2
*           Java group Lab 2
* */

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) {
        // Creating ticket_number1 object with parameterized constructor
        workticket ticket_number1 = new workticket(18572, "Client 1", LocalDate.of(2022, 4, 20), "Ticket 1 Description");
// Creating two more objects from WorkTicket class
        workticket ticket_number2 = new workticket();
        workticket ticket_number3 = new workticket();

// Declared an array of type WorkTicket and added all three objects into an array
        workticket[] tickets = new workticket[] {ticket_number1, ticket_number2, ticket_number3 };

// Created a loop to assign values to the existing WorkTicket objects by using SetWorkTicket method
        for(int i = 1; i <= tickets.length; i++) {
            tickets[i-1].SetWorkTicket(i, "Client " + i, LocalDate.of(2022, 4, i), "Problem in Work Ticket: " + i);
        }

// Created a loop statement to print information of three objects
        for(workticket ticket : tickets) {
            ticket.ShowWorkTicket();
        }
    }
}