package finale;
import java.util.Scanner;
public class Finale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What do you want to get?  Factorial/Fibonacci? ");
        String ab = sc.nextLine();
        System.out.println("Enter desired size of array");
        int cd = sc.nextInt();
        int[] array = new int[cd];
        System.out.println("Enter Elements: ");
        for(int i = 0; i< array.length; i++){
            int ef = sc.nextInt();
            array[i] = ef;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print("f(" + array[i] + ") \t");
        }
        System.out.println("");
        if(ab.equalsIgnoreCase("Factorial")){
            for(int i = 0; i < array.length; i++){
            System.out.print(factorial(array[i]) + "\t");
            }
        }else if (ab.equalsIgnoreCase("Fibonacci")){
            for(int i = 0; i < array.length; i++){
            System.out.print(fibonacci(array[i]) + "\t");
            }
        } else{
            System.out.println("Invalid input");
        }
    }
    public static int fibonacci(int x){
        if(x <=1){
            return x;
        }else{
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
    public static int factorial(int x){
        int i = 1;
        int factorial = 1;
        while(i <= x){
            factorial *= i;
            i++;
        }
        return factorial;
    }
}

