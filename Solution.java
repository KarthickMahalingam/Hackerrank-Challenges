import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<String>[] ts=new TreeSet[26];
        for(int i=0;i<26;i++){
        ts[i]=new TreeSet<String>();
        }
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();        
            if(op.equalsIgnoreCase("add")){
            	System.out.println(((int)contact.charAt(0)));
                ts[((int)contact.charAt(0))%26].add(contact);
            } 
            else if(op.equalsIgnoreCase("find")){
            	int count=0;
            	Iterator i=ts[((int)contact.charAt(0))%26].iterator();
            	while(i.hasNext()){
            		if(i.next().toString().startsWith(contact)){
            			count++;
            		}
            	}
            	System.out.println(count);
            }
            	
        }            
    }
}
