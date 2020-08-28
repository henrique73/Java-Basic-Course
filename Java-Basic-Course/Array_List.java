import java.util.ArrayList;

public class Array_List {
    public static void main(String[]args){
        ArrayList<Integer> arrList = new ArrayList();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        System.out.println(arrList);

        System.out.println(arrList.size());

        for(int i=0;i<arrList.size();i++){
            System.out.println(i);
        }

        for(Integer a: arrList){
            System.out.println(a);
        }

        arrList.remove(2);
        System.out.println(arrList);
    }
}
