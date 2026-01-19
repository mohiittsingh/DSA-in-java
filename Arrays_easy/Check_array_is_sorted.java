public class Check_array_is_sorted {
    static  Boolean Sorted(int [] arr){
        Boolean sorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,3,4};
        Boolean TRUEornot=Sorted(arr);
        System.out.println(TRUEornot);
    }
}
