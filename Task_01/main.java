import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. 
//Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге


public class main {
    // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 123, bookPhone);
        addNumber("Иванов", 1234, bookPhone);
        addNumber("Петров", 546585, bookPhone);
        addNumber("Сидоров", 8956477, bookPhone);
        addNumber("Иванов", 12356233, bookPhone);
        addNumber("Петров", 787897, bookPhone);
        printBook(bookPhone);
       }
}
