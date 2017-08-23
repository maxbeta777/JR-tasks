package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int fi = Integer.parseInt(bufferedReader.readLine());
        int s = Integer.parseInt(bufferedReader.readLine());
        int th = Integer.parseInt(bufferedReader.readLine());
        int f = Integer.parseInt(bufferedReader.readLine());
        if(fi>s)
            if (fi>th)
                if (fi>f)
                    System.out.println(fi);
                else
                    System.out.println(f);
            else
                if (th>f)
                    System.out.println(th);
                else
                    System.out.println(f);
        else
            if (s>th)
                if (s>f)
                    System.out.println(s);
                else
                    System.out.println(f);
            else
            if (th>f)
                System.out.println(th);
            else
                System.out.println(f);
    }
}
