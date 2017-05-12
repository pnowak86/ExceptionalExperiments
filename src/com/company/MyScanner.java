package com.company;

import java.util.Scanner;

/**
 * Created by RENT on 2017-05-12.
 */
public class MyScanner {


    public int getFirstIntFromString(String data) {

        Scanner myScanner = new Scanner(data);
        int result = 0;
        while (myScanner.hasNext()) {
            if (myScanner.hasNextInt())
            {result = myScanner.nextInt();
            }
            else
                myScanner.next();
            //System.out.println("scanner scanned: " + myScanner.next());

           // System.out.println(a);
        }
        return result;
    }

}
