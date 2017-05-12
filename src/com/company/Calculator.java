package com.company;

import com.company.myexceptions.VerySeriousException;

/**
 * Created by adrian on 5/12/17.
 */
public class Calculator {
    public Float divide(Float a, Float b) {
        return a / b;
    }

    public int divideints(int a, int b) {
        return a / b;
    }

    public int divideints2(int a, int b) {
        int res = 0;
        try {

            res = a / b;

        } catch (Exception e) {
            System.out.println(" exception! :" + e.getMessage());
        }

        return res;
    }

    public int divideints3(int a, int b) throws Exception {
        if (b != 2) {
            return a / b;
        } else {
            throw new Exception(" I don't like dividing by 2!!!");

        }
    }




}
