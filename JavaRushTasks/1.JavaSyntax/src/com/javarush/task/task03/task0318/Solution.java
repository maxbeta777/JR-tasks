package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int years = Integer.parseInt(bufferedReader.readLine());
        System.out.println(name+" захватит мир через "+years+" лет. Му-ха-ха!");
    }
}
