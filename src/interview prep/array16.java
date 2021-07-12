import java.util.ArrayList;
import java.util.List;

class rotatelist{
    public static void rotateleft(List<Integer> arr,int d) {
//        while(d>0){
//            int temp=arr.get(0);
//            for(int i=0;i<arr.size()-1;i++){
//                arr.add(i,arr.get(i+1));
//                System.out.println(arr.get(i));
//            }
//            arr.add(temp);
//            for(int i=0;i<arr.size();i++)
//                System.out.println(arr.get(i));
//            d--;
//        }
        arr.add(0, arr.get(1));
        System.out.println(arr.get(0));

    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        int d=2;
        rotateleft(list,d);
        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));
    }
}