import java.util.*;

// Задание

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class DZJ9 {

    // сортируем данные по абонентам
    static void sortedPrint(Map<String, ArrayList> map) {


        Set<String> keySet = map.keySet();

        int maxC = 0;
        int minC = 1_000_000;
        
        for (var item : map.entrySet()) {
            if (maxC < item.getValue().size())
                maxC = item.getValue().size();
            if (minC > item.getValue().size())
                minC = item.getValue().size();
            
        }
 // Формируем стек
 Stack<String> stek = new Stack<>();
 int numer = minC;
 while (numer <= maxC) {
     
     for (var item : map.entrySet()) {
         if (item.getValue().size() == numer) {
             stek.push(item.getKey());
         }  
     }
     numer += 1;
 }
 
 String name;
 for (int i = 0; i < keySet.size(); i++) {
     name = stek.pop();
     for (var item : map.entrySet()) {
         if (name == item.getKey()) {
             System.out.printf("%8s: ", item.getKey());
             System.out.println(item.getValue());
         }
     }
 }
 System.out.println();
}


public static void main(String[] args) {
 
 Map<String, ArrayList> abon = new HashMap<>() {
     {
         put("Королев", new ArrayList<Integer>() {
             {
                 add(123321);
                 add(887788);
                 add(197791);
             }
         });
         put("Васильев", new ArrayList<Integer>() {
             {
                 add(123456);
             }
         });
         put("Сидоров", new ArrayList<Integer>() {
             {
                 add(711177);
                 add(866688);

             }
         });
         put("Иванов", new ArrayList<Integer>() {
             {
                 add(888666);
                 add(323232);
                 add(178871);
             }
         });
     }
 };
 System.out.println();
 
 System.out.println("Список абонентов: ");
 sortedPrint(abon);

 
 Scanner scan = new Scanner(System.in, "cp866");
 Boolean getOut = false;
 String st;
 while (!getOut) {
     System.out.println("Выберите действие (1 - добавить абонента, 9 - выход):");
     st = scan.nextLine();
     String name = "";
     String phString;
     switch (st) {
         case "1": {
             System.out.println("Введите данные абонента:");
             name = scan.nextLine();
             if (abon.containsKey(name)) {
                 System.out.println("Такой абонент уже есть");
                 System.out.println();
                 break;
             } else {
                 System.out.println("Введите номера телефонов через запятую: ");
                 phString = scan.nextLine();
                 String[] arr = phString.split(",");
                 ArrayList<Integer> arrInt = new ArrayList<>();
                 for (String item: arr) {
                     arrInt.add(Integer.parseInt(item.trim())) ;
                 }
                 abon.put(name, arrInt);
                 System.out.println();
                 sortedPrint(abon);
                 break;
             }
         }
         case "9": {
             getOut = true;
             System.out.println();
             System.out.println("Выход");
             System.out.println();
             break;
         }   
             
        
     }
 }
}

    
}
