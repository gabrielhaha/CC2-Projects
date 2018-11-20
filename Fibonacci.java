package fibonacci;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        user();
    }
    public static int display (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of desired sequence: ");
        int l=sc.nextInt();
        return l;
    }
    public static int x(int n){
            if (n <=1){
                return n;
        }else{
                return x(n-1) + x(n-2);  
            }
        }
    public static void user(){
        int a= display();
        for(int b=0; b<a+1; b++){
            System.out.print("" + b + "\t");
        }
        System.out.println("");
            for (int i = 0; i<a+1; i++){
                for (int j = 0; j < i+1; j++) {    
                    System.out.print(x(j) + "\t");
                    
                }
                System.out.println("");
        }
    }
}
