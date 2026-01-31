import java.util.*;
public class Longest_sub_array {

    static int BRUTE_Length_longest_subarray(int[]arr,int k){
        int length=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int l = i; l <= j; l++) {
                    sum = sum + arr[l];
                }    if (sum == k) {
                        length = Math.max(length, j - i + 1);
                    }

            }
        }
        return  length;
    }
    static   int Optimal_Length_Longest_subarray(int [] arr,int k){
         int length=0;
        Map<Long,Integer> map = new HashMap<>();
        long sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum==k){
                length=Math.max(length,i+1);
            }
            long rem=sum-k;
            if(map.containsKey(rem)){
                length=Math.max(length,i-map.get(rem));
            }
            if (!map.containsKey(sum)) {
                map.put((long) sum, i);
            }

        }
return  length;

    }
    static  int Optimal_for_postive_num(int []arr,long k){
        int length=0;
        int left=0;
        int right=0;
        int n= arr.length;
        long sum= arr[0];
     while(right<n) {
         while (left <= right && sum > k) {
             sum -= arr[left];
             left++;
         }
         if (sum == k) {
             length = Math.max(length, right - left + 1);
         }

         right++;
         if (right < n) {
             sum += arr[right];
         }
     }

        return length;
    }

    public static void main(String[] args) {
      int []arr1={1,2,3,1,1,1,1,4,2,3};
        int []arr={2,0,0,0,3};
        int k=3;
        int ans=BRUTE_Length_longest_subarray(arr,k);
        System.out.println(ans+"BRUTE FORCE");
        int ans2=Optimal_Length_Longest_subarray(arr,k);
        System.out.println(ans2+"OPTIMAL APPROACH");
        int ans3=Optimal_for_postive_num(arr1,4);
        System.out.println(ans3+" WITH OPTIMAL FOR +VE");
    }
}
