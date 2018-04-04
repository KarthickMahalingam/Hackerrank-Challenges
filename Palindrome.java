/*
 Program to check wheck the the given string can be converted into a palindrome
*/

import java.io.*;
import java.util.*;
class Palindrome {
    public static boolean canBePalindrome(String input){
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        for(int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);
            if(hmap.containsKey(letter))
                hmap.put(letter, hmap.get(letter)+1);
            else
                hmap.put(letter, 1);
        }
        int count = 0;
        boolean flag = true;
        for(Character key: hmap.keySet()){
            if(hmap.get(key)%2 != 0)
                count++;
            if(count == 2){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
	public static void main (String[] args) {
		System.out.println(canBePalindrome("aaabbbbacd"));
	}
}
