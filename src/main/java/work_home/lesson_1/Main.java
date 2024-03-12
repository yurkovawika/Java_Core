package work_home.lesson_1;

import java.io.*;

public class Main {
    public static void main(String[] args)  {

        Program programm = new Program();
        Export export = new Export();
        export.exportText(programm.getText());

    }
}