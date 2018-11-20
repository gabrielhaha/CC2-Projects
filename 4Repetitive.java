package repetitive;
import java.util.Scanner;
public class Repetitive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a desired number:");
        int x = sc.nextInt();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("Enter your number (0-1000) : ");
        int y = sc.nextInt();
        
        while (y != x){
        if (x % 2 ==0 ){
            System.out.println("HINT: The number is Even");
        }
        else{
            System.out.println("HINT: The number is Odd");
        }
        if (y < x){
            System.out.println("HINT: It is a higher number");
        }
        else if (y > x){
            System.out.println("HINT: It is a lower number");
        }

          
            System.out.println("Enter your number (0-1000) : ");
        y = sc.nextInt();
        
        
        }
        System.out.println("CORRECT!");
        }
    
}
  
