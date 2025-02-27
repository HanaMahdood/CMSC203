import java.util.Scanner;

public class MovieDriver {
    
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
     
        String continueInput = "yes";
        
       
        while (continueInput.equalsIgnoreCase("yes")) {
           
            Movie movie = new Movie();
            
            
            System.out.println("Please Enter the title of a movie:");
            
            
            String title = keyboard.nextLine();
            
           
            movie.setTitle(title);
            
         
            System.out.println("Enter the movie's rating:");
            
     
            String rating = keyboard.nextLine();
            
          
            movie.setRating(rating);
            
           
            System.out.println("Enter the number of tickets sold at Malibu Theatre:");
            
          
            int ticketsSold = keyboard.nextInt();
            
            
            movie.setSoldTickets(ticketsSold);
            
    
            System.out.println(movie.toString());
            
           keyboard.nextLine();
            
        
            System.out.println("Do you want to enter another movie? (yes or no)");

            continueInput = keyboard.nextLine();
        }
        
        System.out.println("Goodbye");
      
        keyboard.close();
    }
}
