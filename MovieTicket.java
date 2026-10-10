import java.util.Scanner;

public class MovieTicket {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Movie Title: ");
        String movieTitle = input.nextLine();
        
        System.out.print("Ticket Price: ");
        double ticketPrice = input.nextDouble();
        
        System.out.print("Number of Tickets: ");
        int numberOfTickets = input.nextInt();
        
        double totalCost = ticketPrice * numberOfTickets;
        
        System.out.print("=== MOVIE TICKETS RECEIPT ===");
        System.out.print("Movie Title: " + movieTitle);
        System.out.print("Ticket Price: " + ticketPrice);
        System.out.print("Number of Tickets: " + numberOfTickets);
        System.out.print("Total Cost: " + totalCost);
    

    }
}