import java.util.Arrays;

class reverseWord{
    public static void main(String[] args) {
        System.out.println(reverse("the sky is pink"));
    }
    static String reverse(String sentence) {
StringBuilder sb = new StringBuilder();
int i=sentence.length()-1;
int j=0;
while (i>=0){
    if(sentence.charAt(i)==' '){
        i--;
    }
    else {
        j = i;
        while (i >= 0 && sentence.charAt(i) != ' ') {
            i--;
        }
        if (sb.length() > 0)
            sb.append(' ');//to add space if string builder contains word
            for (int k = i + 1; k <= j; k++) {
                sb.append(sentence.charAt(k));
            }
    }
}
return sb.toString();
    }

}