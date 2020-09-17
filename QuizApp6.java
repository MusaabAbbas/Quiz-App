
package QuizAppB;
import java.util.Scanner;

/**
 *
 * @author Musaab Abbas
 */
public class QuizApp6 {

    public static void main(String[] args) {
        int score = 0;
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Hell0!");
        System.out.println("What color is the sky");
        String answer1 = kboard.nextLine();
        if (answer1.equalsIgnoreCase("blue")) {
            //give them a point
            score++;
                    System.out.println("Correct!");
        }
        
        else {
            System.out.println("What planet are you living on?");
        }
        
        System.out.println("What is snow made of?");
        String answer2 = kboard.nextLine();
        if (answer2.equalsIgnoreCase("Water")) {
            //give them a point
            score++;
                    System.out.println("Correct!");
        }
        
        else {
            System.out.println("Are you serious?Snow!!!");
        }
        
        System.out.println("What is 5+5?");
        String answer3 = kboard.nextLine();
        if (answer3.equalsIgnoreCase("10")) {
            //give them a point
            score++;
                    System.out.println("Correct!");
        }
       
        
        else {
            System.out.println("No!!..Wake up!!");
        }
        
        System.out.println("What side of the road do we drive on?");
        String answer4 = kboard.nextLine();
        if (answer4.equalsIgnoreCase("Right")) {
            //give them a point
            score++;
                    System.out.println("Correct!");
        }
        
        else {
            System.out.println("Where do think you are?");
        }
        
        System.out.println("Is noon in the morning or night?");
        String answer5 = kboard.nextLine();
        if (answer5.equalsIgnoreCase("morning")) {
            //give them a point
            score++;
                    System.out.println("Correct!");
        }
        
        else {
            System.out.println("Do you go outside....ever?");
        }
        
        System.out.println("Score: "+ score +" out of 5");
        
        
        
    }
    
}
