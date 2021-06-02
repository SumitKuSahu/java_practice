//find common element in 3 sorted array
//O(n) approach
//if we take old methof of 3 loops it will take O(n^3)

class array3{
    public static void commonElements(int a[],int b[],int c[]){
        int x=0,y=0,z=0;
        while(x<a.length&&y<b.length&&z<c.length){
            if(a[x]==b[y]&&b[y]==c[z]){
                System.out.println(a[x]);
                x++;
                y++;
                z++;

            }
            else if(a[x]<b[y]){
                x++;
            }
            else if(b[y]<c[z]){
                y++;
            }
            else z++;
        }

    }
    public static void main(String[] args) {
        int a[]={1,5,9,10,20,40,50};
        int b[]={6,7,9,20,80,100};
        int c[]={3,4,9,15,20,30,70,80,120};
        commonElements(a,b,c);
    }
}