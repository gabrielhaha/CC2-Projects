package calcu;
import java.util.*;
public class Calcu {

 public static void main(String[] args) {
        Scanner bk = new Scanner(System.in);
        
        System.out.println("Enter First number: ");
        double num1 = bk.nextDouble();
        
        System.out.println("Enter Second number: ");
        double num2 = bk.nextDouble();

         System.out.println("Enter Operator: ");
         String aw = bk.nextLine();
          String operation = bk.nextLine();
      
         if((operation.equals("+")) || (operation.equalsIgnoreCase("Add"))){
             System.out.println("Your answer is: " + (num1 + num2));
         }
        else if ((operation.equals("-")) || (operation.equalsIgnoreCase("Subtract"))){
             System.out.println("Your answer is: " + (num1 - num2));
         }
         else if ((operation.equals("*")) || (operation.equalsIgnoreCase("Multiply"))){
             System.out.println("Your answer is: " + (num1 * num2 ));
         }
         else if((operation.equals("/")) || (operation.equalsIgnoreCase("Divide"))){
             System.out.println("Your answer is: " + (num1 / num2));
         }
         else if((operation.equals("%")) || (operation.equalsIgnoreCase("Modulo"))){
             System.out.println("Your answer is: " + (num1 % num2));
         }
         else{
             System.exit(0);
         }
    }
    
}


