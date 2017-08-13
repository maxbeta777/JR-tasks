package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int integer1 = Integer.parseInt(bufferedReader.readLine());
        int integer2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println(name+" получает "+integer1+" через "+integer2+" лет.");
    }
}
