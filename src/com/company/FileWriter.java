package com.company;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by adrian on 5/12/17.
 */

public class FileWriter {

    public void writeMyString(String source) {

        FileOutputStream out;
        PrintStream p;

        try {
            out = new FileOutputStream("mytexts");
            p = new PrintStream(out);
            p.println(source);
            p.close();
        } catch (Exception e) {
            System.err.println("Error writing to my file!");
        }
    }
}
