package countsort;

/**
 *
 * @author CC2_1h-27
 */
public class CountSort {

 void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // The output character array that will have sorted arr 
        int output[] = new int[n]; 
  
        // Create a count array to store count of individual 
        // characters and initialize count array as 0 
        int count[] = new int[256]; 
        for (int i=0; i<256; ++i) 
            count[i] = 0; 
  
        // store count of each character 
        for (int i=0; i<n; ++i) 
            ++count[arr[i]]; 
  
        // Change count[i] so that count[i] now contains actual 
        // position of this character in output array 
        for (int i=1; i<=255; ++i) 
            count[i] += count[i-1]; 
  
        // Build the output character array 
        // To make it stable we are operating in reverse order. 
        for (int i = n-1; i>=0; i--) 
        { 
            output[count[arr[i]]-1] = arr[i]; 
            --count[arr[i]]; 
        } 
  
        // Copy the output array to arr, so that arr now 
        // contains sorted characters 
        for (int i = 0; i<n; ++i) 
            arr[i] = output[i]; 
    }
    public static void main(String[] args) {
      CountSort ob = new CountSort(); 
        int arr[] = {1, 16, 18 , 25, 33, 82, 51, 
                    10, 10, 20, 8, 150, 152
                    }; 
  
        ob.sort(arr); 
  
        System.out.print("Sorted character array is: "); 
        for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i]+"\t"); 
        
        
    }
    
}
/*void counting_sort(int A[], int Aux[], int sortedA[], int N) {

    // First, find the maximum value in A[]
    int K = 0;
    for(int i=0; i<N; i++) {
        K = max(K, A[i]);
    }

    // Initialize the elements of Aux[] with 0
    for(int i=0 ; i<=K; i++) {
        Aux[i] = 0;
    }

    // Store the frequencies of each distinct element of A[],
    // by mapping its value as the index of Aux[] array
    for(int i=0; i<N; i++) {
        Aux[A[i]]++;
    }

    int j = 0;
    for(int i=0; i<=K; i++) {
        int tmp = Aux[i];
        // Aux stores which element occurs how many times,
        // Add i in sortedA[] according to the number of times i occured in A[]
        while(tmp--) {
            //cout << Aux[i] << endl;
            sortedA[j] = i;
            j++;
        }
    }
}*/