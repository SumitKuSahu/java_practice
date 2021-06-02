//segregate all 0s in left side and 1 in right side of an array

class array4
{
    public static void main(String[] args) {
        int a[]={0,1,0,1,0,0,0,1};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                a[j++]=0;//post increment first value is stored then incremented
            }
        }
        while(j<a.length){
            a[j++]=1;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}