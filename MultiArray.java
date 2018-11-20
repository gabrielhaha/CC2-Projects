package multi.array;
import java.util.Scanner;
public class MultiArray {

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        
        System.out.println("Input the number of row: ");
        int rows = sa.nextInt();
        
        System.out.println("Input the number of column: ");
        int columns = sa.nextInt();
        
        int[][] ar = new int[rows][columns];
        for(int r=0; r<ar.length;r++){
            for(int c=0; c<ar[r].length;c++){
            System.out.println("row is: " + (r) + " column is: " + (c));
            ar[r][c] = sa.nextInt();
        }
    }
        System.out.println("");
        System.out.println("Table: ");
        for(int r=0; r<ar.length;r++){
            for(int c=0; c<ar[r].length;c++){
                System.out.print(ar[r][c]+ "\t" );
            }
            System.out.println("");
        }
    }
}
