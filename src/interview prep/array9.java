import java.util.Arrays;

/*merge two sorted array in third sorted array
time complexity O(n1+n2)
* */
class merge{
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={2,3,4,6,7};
        int len1=a.length;
        int len2=b.length;
        int[] c=new int[len1+len2];
        int x=0,y=0,z=0;
        while (x<len1 && y<len2) {
            if(a[x]<b[y]){
                c[z++]=a[x++];
            }
            else
                c[z++]=b[y++];
        }
        while(x<len1){
            c[z++]=a[x++];
        }
        while (y<len2){
            c[z++]=b[y++];
        }
        System.out.println(Arrays.toString(c));
    }
}