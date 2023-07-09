
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DZJ7 {
//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.


    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(2,4,7));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(6,1,8));
        
        DZJ7 task = new DZJ7();
         Deque<Integer> result = task.sum(d1, d2);
        System.out.println(result);
    }
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;
         while (!d1.isEmpty() || !d2.isEmpty()) { 
            int sum = carry;
            if (!d1.isEmpty()) {
                sum += d1.removeFirst();
            }
            if (!d2.isEmpty()) {
                sum += d2.removeFirst();
            }
            result.addLast(sum % 10);
            carry = sum / 10; 
        }
        if (carry != 0) {
            result.addLast(carry);
        }
        return result;
    }
    
}
