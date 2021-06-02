import java.util.*;

class array5{
    public static void removeDuplicateUsingSortings(int[] a){
        Arrays.sort(a);//for sorting
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]) {
                a[j++]=a[i];
            }
        }
        // to add last element
        a[j++]=a[a.length-1];
        for (int i=0;i<j;i++) {
            System.out.print(a[i]);
        }
    }
    private static void removeDuplicateUsingHashing(int[] a) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);//incrementing the counter in value
            }
            else{
                map.put(a[i],1);
            }
        }
    map.forEach((k,v)->System.out.print(k));
    }
    private static void removeDuplicateUsingSet(int[] a) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);//adding elements in set
        }
        set.forEach(element->System.out.print(element));//syntax in java 8
    }
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,4,7,8,1};
        removeDuplicateUsingSortings(a);//O nlogn
        System.out.println();
       removeDuplicateUsingHashing(a);//key is always unique
        //set key to elements and counts to value
        System.out.println();
        removeDuplicateUsingSet(a);//set only contains unique elements

    }




}