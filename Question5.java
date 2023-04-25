import java.util.*;

public class Question5 {
    public static void main(String[] args) 
    {
          /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            arr[i] = in.nextInt();
        }

        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i], freqMap.get(arr[i])+1);
            }
            else{
                freqMap.put(arr[i], 1);
            }
        }

        int maxFreq = 0;
        int mode = 0;
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                mode = entry.getKey();
            }
        }

        System.out.println("Mode: " + mode);
        in.close();
    }
}
