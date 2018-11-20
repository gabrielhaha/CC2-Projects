package userpass;
import java.util.*;
public class Userpass {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter your username: ");
        String name = kb.nextLine();
        
        System.out.println("Enter your password: ");
        String jj = kb.nextLine();
        
        System.out.println("Verify your password: ");
        String jd = kb.nextLine();
        if(jj.equals(jd)){
            System.out.println("Password is Correct! ");
        }else{
            System.out.println("Incorrect Password! ");
        }
        
    }
    
}