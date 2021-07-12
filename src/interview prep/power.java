/*
pow(x,n)=x^n
2^6
x=2,n=6
2^6=(2*2)^3=4^3
4^3=4*4^2
4^2=(4*4)^1
16^1=16*16^0
ans=1
if n%2==0
x=x*x;
n=n/2;
else
ans=ans*x;
n=n-1;
* */

class power{
    public static void main(String[] args) {
        double m=findPower(3.0,2);
        System.out.println(m);
    }
    static double findPower(double x,int n){
        long num=n;
        double ans=1.0;
        if(n<0){
          num=-1*num;
        }
        while(num>0){
            if(num%2==0){
                x=x*x;
                num=num/2;
            }else{
               ans=ans*x;
               n=n-1;
            }
        }
        if(n<0){
            return (double)1.0/(double) ans;
        }
        return ans;
    }
}