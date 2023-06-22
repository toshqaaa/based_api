import java.util.Scanner;

/*
1. Написать программу, которая запросит пользователя ввести <Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
public class FirstTask {

    //Конструктор класса FirstTask
    public FirstTask() {
        System.out.println("Введите имя!");
    }

    public void nameOutput() {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        input.close();
        System.out.println("Привет, " + name);
    }
}
