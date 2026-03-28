public class Kadanes_Algo {
    static  int Kadane(int[]arr){
        int  sum=0;
        int maxi=-9999999;

        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                maxi=Math.max(sum,maxi);
            }
        }
        if(sum<0){
            sum=0;
        }

        return maxi;
    }

     static int Optimal_kadane(int []arr){
        int startindex=0;
        int endindex=0;
        int ansstart=-1;
        int ansend=-1;

        int sum=0;
        int max=-999999999;
        for (int i = 0; i < arr.length; i++) {
            if(sum==0) startindex=i;
            sum+=arr[i];
            if(sum>max){
                max=sum;
                ansstart=startindex;
                ansend=i;
            }

            if(sum<0){
                sum=0;
            }
        }
         for (int j = ansstart; j <= ansend; j++) {
             System.out.print(arr[j]);
         }
        return max;
    }
    public static void main(String[] args) {
int []arr={1,2,3,3,2,-9,0};
        int ans=Optimal_kadane(arr);
        System.out.println(ans);
    }
}
