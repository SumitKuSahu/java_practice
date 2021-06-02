//find pairs with given sum in a sorted array

class array2{
    public static void main(String[] args) {
int arr[]={1,2,3,4,5,6,7};//array is sorted in the ques
        int sum=6;//user input
        int low=0;
         int high=arr.length-1;
         while(low<high){
         if(arr[low]+arr[high]>sum){
             high--;
         }
         else if(arr[low]+arr[high]<sum){
             low++;
         }
         else if(arr[low]+arr[high]==sum){
             System.out.println("pair="+arr[low]+","+arr[high]);
             low++;
             high--;
         }
    }
}
}