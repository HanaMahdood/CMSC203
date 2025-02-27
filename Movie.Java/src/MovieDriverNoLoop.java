import java.util.Scanner;

public class MovieDriverNoLoop {
    
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);

        Movie movie = new Movie();
        
     
        System.out.println("Enter the title of a movie:");
        
     
        String title = keyboard.nextLine();
        
       
        movie.setTitle(title);
        
        
        System.out.println("Enter the movie's rating:");
        
    
        String rating = keyboard.nextLine();
        
        movie.setRating(rating);
        
  
        System.out.println("Enter the number of tickets sold at Malibu theater:");
        
        int ticketsSold = keyboard.nextInt();
        
       System.out.println("Goodbye");
       
        keyboard.close();
    }
}
