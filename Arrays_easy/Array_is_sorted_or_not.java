public class Array_is_sorted_or_not {
    static  boolean check_sorted(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1]){

            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr={1,32,13,4,5};
        boolean final_value=check_sorted(arr);
        System.out.println(final_value);
    }
}
