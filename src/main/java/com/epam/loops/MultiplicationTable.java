package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for(int i=0; i<=10; i++){
            System.out.println(numberTableToPrint + "x" + i + "=" + numberTableToPrint*i);
        }
    }
}
