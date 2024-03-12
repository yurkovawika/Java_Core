package work_home.lesson_1;

import java.util.Scanner;

public class Program {
    Scanner console = new Scanner(System.in);

    public String getText() {
        System.out.println("Введите заметку: ");
        String text = console.nextLine();
        return text;
    }

}
