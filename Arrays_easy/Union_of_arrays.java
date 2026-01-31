import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;


public class Union_of_arrays {
static void Union_bruteforce(int []arr1,int[]arr2){
    int n1= arr1.length;
    int n2= arr2.length;
    Set<Integer>set= new HashSet<>();
    for (int i = 0; i <n1 ; i++) {
        set.add(arr1[i]);
    }
    for (int i = 0; i <n2 ; i++) {
        set.add(arr2[i]);
    }
    for(int nums:set){
        System.out.print(nums);
    }

}
    static  ArrayList<Integer> Optimal_union(int[]arr1,int[]arr2){
    ArrayList<Integer>arr =new ArrayList<>();
    int n1=arr1.length;
    int n2= arr2.length;
    int i=0;
    int j=0;
    while(i<n1 &&j<n2){
        if(arr1[i]<arr2[j]){
            if(arr.isEmpty() ||arr.get(arr.size()-1)!=arr1[i]){
                arr.add(arr1[i]);
            }
            i++;
        }

            else if(arr2[j]<arr1[i]){
                if(arr.isEmpty() ||arr.get(arr.size()-1)!=arr2[j]){
                    arr.add(arr2[j]);
                }
                j++;
            }

        else { // arr1[i] == arr2[j]
            if (arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]) {
                arr.add(arr1[i]);
            }
            i++;
            j++;
        }

    }
    while(j<n2){
        arr.add(arr2[j]);
        j++;
    }
    while(i<n1){
        arr.add(arr1[i]);
        i++;
    }
    return arr;
    }
    public static void main(String[] args) {
    int []arr1={1,2,3,4,5};
    int[]arr2={0,1,2,6,7};
Union_bruteforce(arr1,arr2);
        System.out.println();
        System.out.println("Optimised one");
         ArrayList<Integer> arr=Optimal_union(arr1,arr2);
        System.out.print(arr);

    }

}
