public class Remove_dupliacates {
    static  void Remove(int[]arr){
        int i=0;
        for (int j = 1; j <arr.length; j++) {
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        for (int j = 0; j <= i; j++) {
            System.out.print(arr[j]);
        }

    }

    public static void main(String[] args) {
      int []arr={1,1,1,2,3,4,4,5};
      Remove(arr);
    }
}
