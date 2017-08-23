package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(bufferedReader.readLine());
        int second = Integer.parseInt(bufferedReader.readLine());
        int third = Integer.parseInt(bufferedReader.readLine());
        if (first == second) {
            if (second != third)
                System.out.println(3);
        }
        else
            if (second == third)
                System.out.println(1);
            else
                if (first == third)
                    System.out.println(2);

    }
}
