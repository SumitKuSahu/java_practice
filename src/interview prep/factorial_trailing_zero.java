/*when we multply a no. by 10 the we get a no.trailing 0
1*10=10 1 trail 0
1*10*10=100 2 trail 0

5!=1x2x3x4x5=1x2x3x2x2x5
2x5=1 time
we can cout nt no. of 5 to know trailing 0

* */

class trailing{
    public static void main(String[] args) {
        int count = trailing_zero(100);
        System.out.println(count);
    }
    static int trailing_zero(int n){
        int count = 0;
        while(n>0){
            n=n/5;
            count=count+n;
        }

        return count;
    }
}