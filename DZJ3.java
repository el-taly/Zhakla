//реализовать простой калькулятор

import java.util.Scanner;
public class DZJ3 {
    public static void main(String[] args) {

    Scanner iscanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        char d;
        System.out.println("Введите число a:");
        a = iscanner.nextInt();
        System.out.println("Введите число b:");
        b = iscanner.nextInt();
        System.out.println("Какое действие хотите совершить? ( +, -, *, /): ");
        d = iscanner.next().charAt(0);
            switch(d) {
                case '+': c = a + b;
                    break;
                case '-': c = a - b;
                    break;
                case '*': c = a * b;
                    break;
                case '/': c = a / b;
                    break;
                    default:  System.out.printf("Ошибка! Повторите ввод");
                    return;
              }
              System.out.print("\n  Итог:\n");
              System.out.printf(a + " " + d + " " + b + " = " + c);

            }    
    
}
