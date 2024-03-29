import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class DZJ14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите данные (Фамилия Имя Отчество дата рождения номер телефона пол): ");
        String input = scanner.nextLine();
        
        String[] data = input.split(" ");
        
        if (data.length != 6) {
            System.out.println("Ошибка! Введено неверное количество данных.");
            return;
        }
        
        try {
            String surname = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDate = data[3];
            String phoneNumber = data[4];
            String gender = data[5];
            
            String output = surname + firstName + middleName + birthDate + " " + phoneNumber + gender;
            
            FileWriter fileWriter = new FileWriter(surname + ".txt");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка! Не удалось создать файл.");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Введены неполные данные.");
            return;
        }
        
        System.out.println("Данные успешно сохранены в файле " + data[0] + ".txt");
    }
}
