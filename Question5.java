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
            arr[i] = in.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int mode = arr[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } 
            else if (currentCount > maxCount) {
                maxCount = currentCount;
                    mode = arr[i - 1];
                    currentCount = 1;
            } 
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
            mode = arr[n - 1];
        }

        System.out.println(mode);
        in.close();
    }
}
