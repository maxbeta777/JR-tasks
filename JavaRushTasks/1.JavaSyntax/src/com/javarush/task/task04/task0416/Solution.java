package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        float light = Float.parseFloat(bufferedReader.readLine());
        light = light%60;
        if(((int)light+1)%5==0)
            System.out.println("красный");
        else
        if ((((int)light)+2)%5==0)
            System.out.println("желтый");
        else
            System.out.println("зелёный");
    }
}