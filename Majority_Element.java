import java.util.HashMap;

public class Majority_Element {
    static int Majority_in_array(int [] arr,int n){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i]) >n/2){
                return arr[i];
            }
        }
        return  -1;
    }
    static int   Optimal_majority_in_array(int []arr){
       int count=0;
       int element=0;
        for (int i = 0; i < arr.length; i++) {
            if(count==0){
                element=arr[i];
                count=1;
            }
            else if(arr[i]==element){
                count++;
            }
            else {
                count--;
            }

        }
        int count1=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element) count1++;
        }
        if(count1>(arr.length)/2){
            return  element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,1,1,14};
        int n = arr.length;
//        int ans=Majority_in_array(arr,n);
//        System.out.println(ans);
        int final_ans=Optimal_majority_in_array(arr);
        System.out.println(final_ans);
    }
}

