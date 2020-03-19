package com.company;
import java.util.*;
import java.io.*;
//Author: Raymond Luy
//Date: 3/18/20

public class Main {
    public static boolean oneToOne(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        int i=0;
        while(i < str1.length())
        {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if(map1.containsKey(char1))
            {
                if(char2 != map1.get(char1))
                    return false;
            }
            else
            {
                if(map2.containsKey(char2))
                     return false;
            }
            map1.put(char1, char2);
            map2.put(char2, char1);
            i++;
        }
            return true;
        }
    public static void main(String[] args)
    {
        String stringOne = args[0];
        String stringTwo = args[1];
        System.out.println(oneToOne(stringOne,stringTwo));
    }
}

