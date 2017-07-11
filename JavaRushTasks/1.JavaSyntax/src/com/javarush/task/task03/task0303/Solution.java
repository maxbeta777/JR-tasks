package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(15,  16.2));
        System.out.println(convertEurToUsd(17,  11.2));
    }

    public static double convertEurToUsd(int eur, double course) {
       return eur*course;
    }
}
