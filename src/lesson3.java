import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class lesson3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list1 = new ArrayList();
//        Object object;
//
//        list.add(1);        //Integer
//        list.add(.324);     //Double
//        list.add("привет"); //String
//        list.add(true);     //Boolean
//
//        if (list.get(2) instanceof String){
//            String a = (String) list.get(2);
//        }

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
            list1.add(new Random().nextInt(15));
        }
        list.addAll(list1);
        list.size();
        list.isEmpty();
        list.clear();
        list.set(1,null);
        list.iterator();
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });



        System.out.println(list);
    }

}
