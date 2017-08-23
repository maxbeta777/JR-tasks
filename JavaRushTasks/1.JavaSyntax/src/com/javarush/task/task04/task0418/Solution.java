package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(bufferedReader.readLine());
        int second = Integer.parseInt(bufferedReader.readLine());
        if(first<second)
            System.out.println(first);
        else
            System.out.println(second);
    }
}