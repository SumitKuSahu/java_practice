/*
121=121 palindroem
-121!=121-
10!=01
* */
class palindrome{
    public static void main(String[] args) {
boolean ans=isplaindrome(12321);
System.out.println(ans);
    }
    static boolean isplaindrome(int n){
       if(n<0 || (n%10==0 && n!=0)){
           return false;
       }
       else{
           int reverseno=0;
           while(n>reverseno){
               int pop=n%10;
               reverseno=reverseno*10+pop;
               n=n/10;
           }
           return reverseno==n ||reverseno/10==n;//for even || for true
       }
    }
}