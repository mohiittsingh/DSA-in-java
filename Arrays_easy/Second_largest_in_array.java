public class Second_largest_in_array {

    public static void main(String[] args) {
int []arr={1,2,3,4,7,7,5};
Second_largest(arr);
    }
    static void Second_largest(int []arr){
        int largest=arr[0];
        int second_largest=-1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>second_largest) {
                second_largest=arr[i];

            }
        }
        System.out.println("LARGEST IS :"+largest+" SECOND LARGEST IS :"+second_largest);
    }
}
