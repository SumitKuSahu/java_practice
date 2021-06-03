/*Two sum problem
find pair with given sum in an array
assume each input is exactly one time and you may not use same element twice
* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class twoSum{
    public static int[] twoSumBruiteForce(int[] nums,int target){
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[j]==target-nums[i]){
                   return new int[]{nums[i],nums[j]};
                   // if more than one pair we can print here
               }
           }
       }
       throw new IllegalArgumentException("NO pair found");
    }
    public static int[] twoSumHashMap(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <nums.length; i++){
            map.put(nums[i],i);
        }
        for(int j = 0; j < nums.length; j++){
            int numfind=target-nums[j];
            if(map.containsKey(numfind)&&map.get(numfind)!=j){
                return  new int[]{nums[j],nums[map.get(numfind)]};
            }
        }
       throw new IllegalArgumentException("no pair found");
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15,17};
        int target=18;
        System.out.println("using brute force="+Arrays.toString(twoSumBruiteForce(nums,target)));
        System.out.println("Using HashMap="+ Arrays.toString(twoSumHashMap(nums,target)));
    }
}