import java.util.*;

public class TwoSum {

//    static int[] twoSum(int[] arr, int target) {
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int need = target - arr[i];
//
//            // check first
//            if (map.containsKey(need)) {
//                return new int[]{ map.get(need), i };
//            }
//
//            // store after checking
//            map.put(arr[i], i);
//        }
//
//        return new int[]{-1, -1}; // if not found
//    }
    static  int[] Optimal_twosum_without_original_index(int []arr,int sum){
        int net_sum=0;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            net_sum=arr[i]+arr[j];
            if(net_sum==sum){
              break;
            } else if (net_sum<sum) {
                i++;

            }
            else {
                j--;
            }
        }
        return new int[]{arr[i], arr[j]};

    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 10, 3};
        int target = 13;
//        int[] ans = twoSum(arr, target);
//        System.out.println(ans[0] + " " + ans[1]);
        int []ans2=Optimal_twosum_without_original_index(arr,target);
        System.out.println(ans2[0]+" "+ans2[1]);
    }
}
