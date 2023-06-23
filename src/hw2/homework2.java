package hw2;
//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow, age=null
//
//Дополнительные задания
//
//Дана json-строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder,
//создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
//
//*Сравнить время выполнения замены символа "а" на "А"
//любой строки содержащей >1000 символов средствами String и StringBuilder.
public class homework2 {
    public static void main(String[] Args){
//        String sql = "select * from students where ";
//        System.out.println(sql + whereMethod());
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//       System.out.println(jsonRequest());

        jsonRequest();

    }
    public static String whereMethod(){
        StringBuilder builder = new StringBuilder("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\")}");
        String stringWhere = builder.toString().replace("\"", " ").replace(":","=");
//        if (stringWhere.contains("null")){
//            stringWhere
//        }
        return stringWhere;
    }
    public static void jsonRequest(){
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        //System.out.println(json);
//        String jsontemp = json.replace("\"", " ").replace("{", "").replace("}", "").replace("[", "").replace("]", "");
//        System.out.println(jsontemp);

//        String[] jsonTmp = json.split("[{}\\s]+");
//        for (int i = 0; i < jsonTmp.length; i++) {
//            for (int j = 0; j < jsonTmp.length; j++) {
//                String json = jsonTmp[i].toString().replace("\"", " ");
//            }
//        }
//        String json1 = jsonTmp[0].toString().replace("\"", " ");
//        String json2 = jsonTmp[1].toString().replace("\"", " ");
//        String json3 = jsonTmp[2].toString().replace("\"", " ");
//        System.out.println(json1);
//        System.out.println(json2);
//        System.out.println(json3);

        json.toString().replace("\"", " ");
        StringBuilder builder = new StringBuilder("Студент [фамилия] получил [оценка] по предмету [предмет]");
    }
}
