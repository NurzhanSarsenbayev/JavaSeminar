package hw3;

import java.util.ArrayList;
import java.util.Random;

//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class homework3 {
    public static void main(String[] Args) {

        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i <10; i++) {
            arrayList.add(new Random().nextInt(25));
        }
        System.out.println(arrayList);
        ArrayList<Integer> newArrayList = new ArrayList();
        newArrayList = deleteChet(arrayList);
        System.out.println(newArrayList);
        int min = minValue(arrayList);
        System.out.println(min);
        int max = maxValue((arrayList));
        System.out.println(max);
        Double mean = meanValue(arrayList);
        System.out.println(mean);
    }
    public static ArrayList<Integer> deleteChet(ArrayList<Integer> array){
        ArrayList<Integer> newArray= new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i)%2!=0 || array.get(i) == 0){
                newArray.add(array.get(i));
            }
        }
        return newArray;
    }
    public static int minValue(ArrayList<Integer> array){
        int minV = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) < minV){
                minV = array.get(i);
            }
        }
        return minV;
    }

    public static int maxValue (ArrayList<Integer> array){
        int maxV = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i)>maxV){
                maxV = array.get(i);
            }
        }
        return maxV;
    }
    public static Double meanValue(ArrayList<Integer> array){

        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum+=array.get(i);
        }
        double mean = (sum/ array.size());
        return mean;
    }
}

