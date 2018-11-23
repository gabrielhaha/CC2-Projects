package finale;
import java.util.Scanner;
public class Finale {

    static String input;
    static Scanner sc =new Scanner (System.in);
    static Scanner fact= new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println(inputmethod()); 
    }
    
    public static String inputmethod(){
        System.out.println("Enter a word: ");
        input=sc.next();
        if (input.equalsIgnoreCase("factorial")){
                System.out.print("Enter the size of array: ");
                int y = fact.nextInt();
                int [] factar= new int [y];
                
                System.out.println("Enter "+y+" numbers: ");
                for (int i=0; i<factar.length;i++) 
                {
                factar [i] = fact.nextInt();
                System.out.print("");
                }
                
                //This is for the Fibonacci counter (e.g. f(0),f(1) and so on and so forth)

                for (int b=0; b<y;b++){System.out.print("f ("+factar[b]+")\t");}
                System.out.println();
                
                 for (int column=0;column<y;column++) { System.out.print(factorial(factar[column])+"\t");}
        }
        else if (input.equalsIgnoreCase("fibonacci")){
                Scanner fib= new Scanner (System.in);
                System.out.print("Enter a number: ");
                int a=fib.nextInt();

                //This is for the Fibonacci counter (e.g. f(0),f(1) and so on and so forth)

                for (int b=0; b<a+1;b++){System.out.print("f ("+b+")\t");}
                System.out.println();

                //This is for the rows and columns
                for (int row = 0; row < a+1; row++){
                    for (int column=0;column<row+1;column++){ System.out.print(fact(column)+"\t");}
                    System.out.println(); }
        }
        else {return inputmethod();}
        return input;
    }
    
    
    
   //This method is for the factorial
    public static int factorial (int n){
    if (n<=1){
        return 1;
    }else {
        return n*factorial(n-1);
    }}  
     
    //This method is for the fibonacci
    public static int fact (int m){
    if (m<=1)
        { return m ;} 
        else 
        { return fact (m-1)+ fact (m-2);}
        
    }    
}
