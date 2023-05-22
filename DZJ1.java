//вычислить n-ое треугольное число (сумма чисел от 1 до n ), n! (произвдение чисел от 1 до n)
import java.util.Scanner;
public class DZJ1 {
    public static void main(String[] args) {
    
        Scanner iscanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = iscanner.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a=a * i;
            if (i != n) {
                System.out.print(i + "+");
                
               // a += i;
           }
            else {
                System.out.print(i + "=");
                System.out.println(n*(n+1)/2);
                System.out.print("факториал n = " + a);
            }
        }
       
            
}
}