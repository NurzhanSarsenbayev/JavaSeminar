import java.util.*;

//1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//2. вывод в формате Фамилия И.О. возраст пол
import java.util.ArrayList;
import java.util.Scanner;

/*
 1. Организовать ввод и хранение данных пользователей.
 ФИО возраст и пол
 2. вывод в формате Фамилия И.О. возраст пол
 3. добавить возможность выхода или вывода списка отсортированного по возрасту!)
 4. реализовать сортировку по возрасту с использованием индексов
 */
public class lesson4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // String head = "select * from students where ";
        // StringBuilder sb = new StringBuilder(head);
        // String words = "имя: , пол: , возраст: ";

        // System.out.println(prompt(words, sb));

        ArrayList<ArrayList<String>> majorList = new ArrayList<>();

        while (true) {
            ArrayList<String> listInput = getList();
            if (listInput == null) {
                break;
            }
            majorList.add(listInput);
        }
        sortList(majorList);
printInterface(majorList);
    }


    public static void addParametr(int count) {
        switch (count) {
            case 0:
                System.out.println("Введите имя: ");
                break;
            case 1:
                System.out.println("Введите пол: ");
                break;
            case 2:
                System.out.println("Введите возраст: ");
                break;
            default:
                System.out.println("Что-то не так, попробуйте ещё раз.");
                break;
        }
    }

    public static ArrayList<String> getList() {
        ArrayList<String> listInput = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            addParametr(i);
            String word = scanner.nextLine();
            if (word.equals("q")) {
                return null;
            }
            listInput.add(word);
        }
        return listInput;
    }

    public static StringBuilder strBuilder(String str, String name) { //создаем и описываем метод
        StringBuilder build = new StringBuilder(str); // перегоняем получаемую методом строку в билдер
        int index = build.indexOf(name, 0);  // определяем индекс вхождения заданного имени студента в билдере
        build = build.replace(0, index, "Студент "); // срезаем все данные в билдере до нужного имени и меняем согласно требуемого формата
        index = build.indexOf("\"", 0); // т.к. формат записи однообразный, а данные учеников последовательны то индекс первого символа " принимаем как начальную границу след этапа форматирования
        int index2 = build.indexOf(":", 0);// также определяем конечную границу форматирования по символу :+1
        build = build.replace(index, index2 + 2, " получил ");// форматируем часть строки границы которой мы определили
        index = build.indexOf("\"", 0);// ну и тд
        index2 = build.indexOf(":", 0);
        build = build.replace(index, index2 + 2, " по предмету ");
        index = build.indexOf("\"", 0);
        build = build.replace(index, build.length(), ".");
        return build; // возвращаем текст в отформатированном виде
    }
    public static void printInterface(ArrayList<ArrayList<String>> list) {
        for (ArrayList<String> strings : list) {
            int count = 0;
            for (int i = 0; i < strings.size(); i++) {
                System.out.print(strings.get(i) + " ");
                count++;
                if (count == 3) {
                    System.out.println();
                }
            }
        }
    }
    //3. добавить возможность выхода или вывода списка отсортированного по возрасту!)
    public static void sortList(ArrayList<ArrayList<String>> list){
        System.out.println("Хотите сортировать по возрасту, если да, нахмите S: ");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.toUpperCase().equals("S")){
            list.sort(new Comparator<ArrayList<String>>() {
                @Override
                public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                    int r = Integer.parseInt(o1.get(2)) - Integer.parseInt(o2.get(2));
                    return r;
                }
            });
//            for (ArrayList<String> strings : list) {
//                int temp = Integer.parseInt(strings.get(3));
//                for (int i = 1; i < list.size(); i++) {
//                    if(temp>Integer.parseInt(strings.get(3))){{
//                            temp = Integer.parseInt(strings.get(3));
//                            mas[i] = mas[i+1];
//                            mas[i+1] = buf;
//                    }
//                }

            }
        }

    }
