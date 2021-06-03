/*Insertion sort
1.traverse left to right
2.take each element and compare it to items on its left
3.insert it to its correct position
* */
class Insertion{
    public static void main(String[] args) {
        int a[]={1,3,4,2};

        for (int i=1; i<a.length;i++){
            int temp=a[i];
            int j=i-1;
            while (j>=0&&temp<a[j]){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}