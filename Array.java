package array;
import java.util.ArrayList;
import java.util.Arrays;
public class Array {

    public static void main(String[] args) {
        
          int a[]={3,9,15,20,65,23,18,4,2,14,21};
       
       ArrayList<Integer> odd = new ArrayList<>();
       ArrayList<Integer> even = new ArrayList<>();
               
for(int i=0;i<a.length;i++){  
    if(a[i]%2!=0){  
        odd.add (a[i]);
}
    else if (a [i] % 2 == 0) {
        even.add (a[i]);    
    }
    }
        System.out.println(Arrays.toString(a));
            System.out.println("Odd\tEven");
            for(int x = 0; x < 5 ; x++){
                System.out.println(odd.get(x)+"\t"+even.get(x));
            }
        }
}