package hw1;

import java.util.Arrays;
import java.util.Random;

//    Первый семинар.
//    1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//    2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//    3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//    4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//    Пункты реализовать в методе main
//    *Пункты реализовать в разных методах
//
//     int i = new Random().nextInt(k); //это кидалка случайных чисел!)
public class lesson1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println(i);
        int n = mostSignificantBit(i);
        System.out.println(n);
        int[] m1 = maxValueMultiply(n, i);
        System.out.println(Arrays.toString(m1));
        int[] m2 = minValueNonMultiply(n, i);
        System.out.println(Arrays.toString(m2));

    }

    public static int mostSignificantBit(int value) {
        String binaryString = (Integer.toBinaryString(value));
        long binary = Long.parseLong(binaryString);
        int count = 0;
        while (binary > 0) {
            binary /= 10;
            count++;
        }
        return count;
    }

    public static int[] maxValueMultiply(int value, int min) {
        int max = Short.MAX_VALUE;
        int size;
        if (min % value == 0) {
            size = (max - min) / value + 1;
        } else {
            size = (max - min) / value;
        }
        System.out.println(size + " - size of array m1");
        int[] array = new int[size];
        for (int j = min; j < min + value; j++) {
            if (j % value == 0) {
                array[0] = j;
            }
        }
        int temp = value;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[0] + value;
            value += temp;
        }
        return array;
    }

    public static int[] minValueNonMultiply(int value, int max) {
        int min = Short.MIN_VALUE*-1;
        int size = (min + max) - ((min / value) + (max / value)) + 1;
        System.out.println(size + " - size of array m2");
        int[] array = new int[size];
        min = min * -1;
        for (int i = 0; i < size; i++, min++) {
            if (min % value != 0 || min == 0) {
                array[i] = min;
            } else {
                i--;
            }
        }
        return array;
    }
}

