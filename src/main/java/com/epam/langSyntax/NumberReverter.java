package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int digitOne = number/100;
        int digitTwo = (number%100)/10;
        int digitThree = number%10;

        System.out.println(digitThree+""+digitTwo+""+digitOne);
    }
}
