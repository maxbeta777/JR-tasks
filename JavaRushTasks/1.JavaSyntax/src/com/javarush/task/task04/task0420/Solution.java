package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(bufferedReader.readLine());
        int second = Integer.parseInt(bufferedReader.readLine());
        int third = Integer.parseInt(bufferedReader.readLine());
        if (first > second )
            if (second > third)
                System.out.println(first+" "+second+" "+third);
            else
                if (first > third)
                    System.out.println(first+" "+third+" "+second);
                else
                    System.out.println(third+" "+first+" "+second);
        else
            if (first > third)
                System.out.println(second+" "+first+" "+third);
            else
                if (third > second)
                    System.out.println(third+" "+second+" "+first);
                else
                    System.out.println(second+" "+third+" "+first);
    }
}
