package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private Boolean hasFur;

    public Animal(String color, int numberOfPaws, Boolean hasFur){
        this.color=color;
        this.hasFur=hasFur;
        this.numberOfPaws=numberOfPaws;
    }

    public String getDescription(){
        String pawCondition, furCondition;
        if(numberOfPaws==1){
            pawCondition="paw";
        } else{
            pawCondition="paws";
        }

        if(hasFur){
            furCondition="a";
        } else{
            furCondition="no";
        }

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawCondition + " has " + furCondition + " fur.";
    }
}
