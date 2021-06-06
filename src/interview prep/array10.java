class bubblesort{
    private static void bubblesortusingrecursion(int[] a,int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
        bubblesortusingrecursion(a,n-1);
    }

    public static void main(String[] args) {
        int a[]={2,1,3};
        bubblesortusingrecursion(a,a.length);
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}