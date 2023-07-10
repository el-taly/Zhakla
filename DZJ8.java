
import java.util.*;
import java.util.Arrays;


/*Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.
Пусть дан список сотрудников:
Александр Петров
Алексей Королев
Айя Белова
Павел Иванов
Сергей Кузнецов
Ольга Акимова
Светлана Попова
Написать программу, которая найдёт и выведет повторяющиеся 
имена с количеством повторений. Отсортировать по убыванию популярности.*/

public class DZJ8 {

    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Александр Петров", Arrays.asList("723-23-23", "165-22-55"));
        phoneBook.put("Алексей Королев", Collections.singletonList("144-33-88"));
        phoneBook.put("Айя Белова", Collections.singletonList("134-56-34"));
        phoneBook.put("Павел Иванов", Arrays.asList("156-64-42", "538-03-62", "678-81-37"));
        phoneBook.put("Сергей Кузнецов", Collections.singletonList("907-79-01"));
        phoneBook.put("Ольга Акимова", Collections.singletonList("294-61-89"));
        phoneBook.put("Светлана Попова", Collections.singletonList("172-82-90"));
       
        Map<String, Integer> CountName = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            String firstName = name.split(" ")[0];
            CountName.put(firstName, CountName.getOrDefault(firstName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(CountName.entrySet());
        Collections.sort(sortedNames, Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedNames) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }    
}
    

