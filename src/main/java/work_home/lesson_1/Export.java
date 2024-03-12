package work_home.lesson_1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Export {

    public final String date = new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());

    public void exportText (String text){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("Заметки.txt", true), "utf-8"))) {
            writer.write(date + " -> " + text + "\n");
            System.out.println("Дозапись в файл: " + date + " -> " + text + "\n" );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
