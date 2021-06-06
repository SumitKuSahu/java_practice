//kadane's algorithm- maximum sub array sum
// subarray is contiguous
class SubArray{
    private static void findmaxsubarraysum(int[] a){
        int sum = 0;//stores sum at every point
        int maxsum=0;
        for(int i=0;i<a.length;i++){
            if(sum<0){
                sum =a[i];
            }// for handling negative sum
            else sum=sum+a[i];
            maxsum=Math.max(maxsum,sum);
            System.out.println(maxsum);
        }

    }
    public static void main(String[] args) {
        int[] a={1,2,-5,4,3,8,5,-10};
        findmaxsubarraysum(a);
    }
}