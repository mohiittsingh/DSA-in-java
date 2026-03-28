public class Buy_sell_stocks {
    static int Buy_Sell(int[]arr){
        int maxi=0;
        int cost=0;
        int minprice=arr[0];
        for (int i = 1; i < arr.length; i++) {
            cost=arr[i]-minprice;
            maxi=Math.max(maxi,cost);
            minprice=Math.min(minprice,arr[i]);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int [] arr={7,1,5,3,6,4};
        int ans=Buy_Sell(arr);
        System.out.println(ans);
    }
}
