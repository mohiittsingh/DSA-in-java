import java.util.HashSet;
import java.util.Set;

public class Remove_duplicates_from_array {
   static  void Remove(int arr[]){
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < arr.length; i++) {
//         set.add(arr[i]);
//        }
//        int index=0;
//        for (int num : set) {
//           arr[index]=num;
//           index++;
//        }
//        for (int i = 0; i < index; i++) {
//            System.out.println(i);
//        }
       //------------BRUTE FORCE APPROACH-----------------------
//______________________________NOW OPTIMAL_____________________
       int i=0;
       for (int j = 1; j < arr.length; j++) {
           if(arr[j]!=arr[i]){
               arr[i+1]=arr[j];
               i++;
           }


       }
       for (int k = 0; k <= i; k++) {
           System.out.print(arr[k] + " ");
       }

   }
    public static void main(String[] args) {
             int []arr={0,1,1,2,3};
             Remove(arr);
    }
}
