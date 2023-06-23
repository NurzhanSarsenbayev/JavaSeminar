import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Random;

//1. Создать словарь с ключом число и значением - случайное число.
//        Вывести в консоль только пары в которых значение кратно двум!
//Создать два словаря, ключи это случайные числа до 25
//        а значения первого списка мужские имена а второго женские.
//        Вывести в консоль сумму значений только пар у которых есть ключ в обоих словарях.
public class lesson5 {
    public static void main(String[] args){
//    HashMap<Integer, Integer> hashmap = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            hashmap.put(i, new Random().nextInt(10));
//        }
////        for (int i = 0; i < hashmap.size(); i++) {
////            if (hashmap.values()%2 == 0)
////        }
        HashMap<Integer, String> hashmap1 = new HashMap<>();
        HashMap<Integer, String> hashmap2 = new HashMap<>();
        hashmap1.put(1, "keith1");
        hashmap1.put(2, "keith2");
        hashmap1.put(3, "keith3");
        hashmap1.put(4, "keith4");
        hashmap1.put(5, "keith5");

        hashmap2.put(1,"karen1");
        hashmap2.put(2,"karen2");
        hashmap2.put(3,"karen3");
        hashmap2.put(4,"karen4");
        hashmap2.put(5,"karen5");

        for (int k : hashmap1.keySet()) {
if(hashmap2.containsKey(k)){
    System.out.println(hashmap1.get(k)+hashmap2.get(k));
}
        }

    }

}
