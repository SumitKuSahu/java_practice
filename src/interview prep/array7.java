/*find second smallest no. ina an array
1. sort and print second index element o (nlogn), if 0 and 1st index no, repeats it give wrong output
2.
* */

class secondsmallest{
    public static int findSecondSmallest(int[] a){
        int lowest=Integer.MAX_VALUE;//if we take a[0] second if cond will never be true
        int secondLowest=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]<lowest){
                secondLowest=lowest;
                lowest=a[i];
            }
            if(a[i]>lowest&&a[i]<secondLowest){
                secondLowest=a[i];
            }
        }
        return secondLowest;
    }
    public static void main(String[] args) {
        int a[]={1,2,1,3,-1};
       int secondLowest= findSecondSmallest(a);
       System.out.println(secondLowest);
    }
}