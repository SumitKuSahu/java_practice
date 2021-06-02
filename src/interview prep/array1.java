//find duplicate elements in an array

import java.util.HashSet;
import java.util.Set;

class array1{
    public static void main(String[] args) {
        int arr[]={1,2,3,12,4};
        boolean isDuplicate=false;
        Set<Integer> duplicate=new HashSet<Integer>();
        for (int i=0; i<arr.length; i++){
            if(duplicate.contains(arr[i])) {
                isDuplicate = true;
                System.out.println("Duplicate Element is:" + arr[i]);
            }
                else
                duplicate.add(arr[i]);
            }

        if(!isDuplicate){
            System.out.println("no duplicate element");
        }
        }
    }
