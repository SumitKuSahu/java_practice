/*buy and sell stocks-1
* given array of stock prices ,at most one transaction is allowed(buy one and sell one),
* design to get max profit
* you cannot sell a stock before buying one*/
class maxprofit{
    private static  int getmaxprofit(int[] a){
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min)min=a[i];
            if(a[i]-min>max)max=a[i]-min;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a={1,15,20,2,5,3,6,4,7};
        int result=getmaxprofit(a);
        System.out.println(result);
    }
}