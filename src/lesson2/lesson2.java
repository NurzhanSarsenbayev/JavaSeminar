package lesson2;

import java.util.Scanner;

// Напишите программу,
// чтобы найти вхождение в строке (содержащей все символы другой строки).

//  Напишите программу, чтобы проверить,
//  являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
public class lesson2 {
    public static void main(String[] args) {
//        task1();
task2();
    }

    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("напишите строку: ");
        String s1 = scan.nextLine();
        System.out.println(s1);
        System.out.println("напишите вторую строку: ");
        String s2 = scan.nextLine();
        System.out.println(s1.contains(s2));

    }
    public static void task2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("напишите первую строку: ");
        String s1 = scan.nextLine();
        System.out.println("напишите вторую строку: ");
        System.out.println(s1.equals(new StringBuilder(scan.nextLine()).reverse().toString()));
    }
}

