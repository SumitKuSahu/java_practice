//reversing an array
class reverseArray{
    private static  void getreverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            end--;
            start++;
        }
    }
    public static void main(String[] args) {
        int[] a={3,4,2,1,8,0};
        getreverse(a);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}