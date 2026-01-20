public class Find_only_present_once {
    static  void Find_once(int []arr){
        int taritor=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]!=arr[j]){
                    taritor=arr[i];
                }
            }

        }
        System.out.println(taritor);
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,4,4};
        Find_once(arr);
    }
}
