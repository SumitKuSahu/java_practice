/*max of all sub arrays of size k(size of sub array)
bruteforce-o(n^2)
window sliding method-o(n)
* */

import java.util.Arrays;

class SubArray1{
    private static int bruteforce(int[] a,int k){
        int sum,maxsum=0;
        for(int i=0;i<=a.length-k;i++){
            sum=0;
            for(int j=i;j<k+i;j++){
                sum=sum + a[j];
            }
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
    private static int slide(int[] a,int k) {
        int sum=0;
        int maxsum=0;
        int start=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(i>=k-1){
                maxsum=Math.max(maxsum,sum);
                sum=sum-a[start];
                start++;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] a={2,1,5,1,3,2,8};
        int k=3;
        int result1=bruteforce(a,k);
        System.out.println(result1);
        int result2=slide(a,k);
        System.out.println(result2);
    }
}
