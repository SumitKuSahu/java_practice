//find max diff between two array element
//given largest no. should appear after smallest
class maxdiff{
    private static int bruteforce(int[] a){
        int maxdiff=0;
        for(int i=0;i<a.length; i++){
            for(int j=i+1;j<a.length; j++){
                if(a[i]<a[j]){
                   maxdiff=Math.max(maxdiff,a[j]-a[i]);
                }
            }
        }
        return maxdiff;
    }
    private static int findmaxdiff(int[] a){
        int maxdiff=a[1]-a[0];
        int minele=a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]-minele>maxdiff){
                maxdiff=a[i]-minele;
            }
            if(a[i]<minele){
                minele=a[i];
            }
        }
        return maxdiff;
    }
    public static void main(String[] args) {
        int a[]={7,1,9,5,6,13,2};
        int max=bruteforce(a);
        System.out.println(max);
        int max1=findmaxdiff(a);
        System.out.println(max1);
    }
}