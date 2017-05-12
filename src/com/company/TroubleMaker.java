package com.company;

import com.company.myexceptions.Trouble;

/**
 * Created by adrian on 5/12/17.
 */
public class TroubleMaker {
    public String getSomeText(){
        return generateSomeText();
    }

    private String generateSomeText() {
        return textGenerator();
    }

    private String textGenerator(){
        //throw new Trouble("this is serious!");
        return "here is some text";
    }
}
