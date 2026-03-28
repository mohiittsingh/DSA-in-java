import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_consecutive_sequence{
    static int Longest_sequence(int[] arr) {

        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            int x = arr[i];
            int count = 1;

            // check if next consecutive numbers exist
            while (ls(arr, x + 1)) {
                x = x + 1;
                count++;
            }

            maxLength = Math.max(maxLength, count);
        }

        return maxLength;
    }
    static boolean ls(int[] arr, int target) {

        int i = 0;

        while (i < arr.length) {

            if (arr[i] == target) {
                return true;   // element found
            }

            i++;
        }

        return false;  // element not found
    }

    static int Better_longest_consecutive_sequence(int[] arr) {

        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int longest = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                continue;
            }

            else if (arr[i] == arr[i - 1] + 1) {
                count++;
            }

            else {
                count = 1;  
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
    static int Optimal_longest_sequence(int []arr){
        int longest=1;
        Set<Integer> arr_set= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr_set.add(arr[i]);
        }
        for(int num:arr_set){
            if(!arr_set.contains(num-1)){
                int currentnum=num;
                int currentstreak=1;
                while(arr_set.contains(currentnum+1)){
                    currentnum++;
                    currentstreak++;
                }
                longest = Math.max(longest, currentstreak);
            }

        }
        return longest;



    }


    public static void main(String[] args) {
        int []arr={1,38,6,0,2,4,5,32};
//        int length= Better_longest_consecutive_sequence(arr);
        int length=Optimal_longest_sequence(arr);
        System.out.println(length);
    }
}
