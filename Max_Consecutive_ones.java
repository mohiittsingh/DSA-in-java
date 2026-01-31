import java.util.Arrays;

public class Max_Consecutive_ones {
      static void Consecutive_ones(int []arr) {
          int count=0;
          int maxi=0;
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            } else {
                count=0;
            }
        }
          System.out.println(maxi);

    }

    public static void main(String[] args) {
        int []nums = {1,1,0,1,1,1};
        Consecutive_ones(nums);
    }
}
