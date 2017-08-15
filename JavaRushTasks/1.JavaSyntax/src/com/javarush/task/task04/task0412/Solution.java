package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int integer = Integer.parseInt(bufferedReader.readLine());
        if(integer>0)
            System.out.println(integer*2);
        else
        if(integer<0)
            System.out.println(integer+1);
        else
            System.out.println(0);
    }
}