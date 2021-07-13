import java.util.Arrays;

/*solve in o(1)space */
class reverse{
    public static void main(String[] args) {
        System.out.println(reverse_string("hello"));
    }
    static String reverse_string(String s){
        String[] ary=s.split("");
   String tmp;
        int left=0;
        int right=s.length()-1;
while(left<right){
    tmp=ary[left];
    ary[left]=ary[right];
    ary[right]=tmp;
    left++;
    right--;
}
return Arrays.toString(ary);
    }

}