//вывести все простые числа от 1 до 1000)

public class DZJ2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (i % 2 != 0) {
                if (i == 3 || i % 3 != 0){
                   if (i == 7 || i % 7 != 0) {
                        System.out.print(i + " ");
                   }
               }
            }
        }
    }
}
