public class Sort_zeroes_ones {
    static  Void Sort_zeros_ones(int [] arr){
        int n= arr.length;
        int low=0,mid=0,high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        return null;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

    }
}
