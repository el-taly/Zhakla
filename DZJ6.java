import java.util.ArrayList;

public class DZJ6 {
    //дан произвольный список целых чисел 1) удалить четные, 2) найти мин 3) найти макс 3) найти среднее
    public static void PrintArray(ArrayList<Integer> arr){ //Печать списка
        for(int element: arr) {
            System.out.printf("%d, ", element);
        }
        System.out.println();
    }
public static ArrayList<Integer> FillRandomArray(int n) {  //заполнение списка случайными целыми числами
    ArrayList <Integer> list = new ArrayList<>();
    for(int i = 0; i < n; i++){
        list.add((int)(Math.random()*100));
    }
    return list;
}
public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();
    array = FillRandomArray(10);
    PrintArray(array);
    DeleteEvenNumber(array);
    PrintArray(array);
}
public static void DeleteEvenNumber(ArrayList<Integer> list){
    int i = 0;
    while (i < list.size()){
        if(list.get(i) % 2 == 0) list.remove(i);
        else i++;
    }
}   

}
