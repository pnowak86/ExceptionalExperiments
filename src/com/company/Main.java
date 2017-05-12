package com.company;

import com.company.myexceptions.VerySeriousException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        printExample("example 1");

        Float result = calc.divide(4f, 9f);
        System.out.println(result);

        Float result2 = calc.divide(4f, 0f);
        System.out.println("result2 is: " + result2);

        separator();

        printExample("example 2");

        //example 2 - now an Exception is being "thrown" by Java
        //- our program will terminate

        //int result3 = calc.divideints(3,0);
        //System.out.println("result3 is: " + result3);

        printExample("example 3");
        int result4 = calc.divideints2(3, 0);
        System.out.println("result4 is: " + result4);

        separator();

        printExample("example 4");
        //let's try again dangerous example 2
        try {
            int result5 = calc.divideints(3, 0);
            System.out.println("result5 is: " + result5);
        } catch (ArithmeticException e) {
            System.out.println("..it failed but program is fine...");
        }

        separator();

        printExample("example 5");
        //uncomment this line and see what happens:


        //we need to "catch" exception object thrown by that method:

        // "happy" path
        try {
            int result6 = calc.divideints3(10, 5);
            System.out.println("result6 is: " + result6);
        } catch (Exception e) {
            System.out.println("exception caught!");
            e.printStackTrace();
        }

        separator();

        // "not happy" path
        try {
            int result6 = calc.divideints3(10, 2);
            System.out.println("result6 is: " + result6);
        } catch (Exception e) {
            System.out.println("exception caught!");

        }

        printExample("example 6");
        separator();

        StringsConverter sc = new StringsConverter();

        //this conversion will work:

        try {
            String converted = sc.uppcaseString("pewnego razu kotek wlazl na plotek");
            System.out.println(converted);
        } catch (Exception e) {
            System.out.println(" this will never be printed");
        }

        try {
            String converted = sc.uppcaseString("dupa");
            System.out.println(converted);
        } catch (VerySeriousException e) {
            System.out.println(e.getMessage());
            System.out.println(" bad word has been used? ");
        }


        printExample("Example 6");
        separator();


        try {
            String convertedFile = sc.convertDocument();
            System.out.println(convertedFile);
        } catch (FileNotFoundException e) {
            System.out.println("no file found? really?");
            System.out.println(e.getMessage());
        }

        printExample("Example 7");
        separator();
        //demonstrate how to throw exceptions and catch them in nested calls.

        TroubleMaker tr = new TroubleMaker();
        System.out.println(tr.getSomeText());

        printExample("Example 8");
        separator();
        //how to handle exceptions in real world scenario?
        //mind the factory class pattern...

        FileWriter fw = WriterFactory.getFileWriter();
        fw.writeMyString("this is my diary");

        System.out.println("\n ---- SUCCESS! this is the end of our program ----\n");

        separator();
        printExample("Example 9");

        //uncomment before explaining

        //yet another source of possible Exceptions - let's scan some text!

       /* Scanner myScanner = new Scanner(" wlazl kotek na plotek");
        while (myScanner.hasNext()) {
            System.out.println("scanner scanned: " + myScanner.next());
            int a = myScanner.nextInt();
            System.out.println(a);
        }*/

        //yes - it failed - exercise - extract this to external function and
        //handle exceptions. Function should return FIRST integer found in
        //input argument and the input argument should be of type String.


    }

    private static void separator() {
        System.out.println("\n --------- \n ");
    }

    private static void printExample(String title) {
        System.out.println("\n" + title + "\n");
    }


}
