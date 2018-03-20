//Flatten array - Converts Jagged Array into 1D array

import java.io.*;
import java.util.*;

class flattenArray{
    
    public static int[] flattenArray(Object[][] obj){
        ArrayList<Integer> result = new ArrayList<Integer>();
        String temp = Arrays.deepToString(obj).replaceAll("\\[|\\]| ","");
        int res[] = Arrays.stream(temp.split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(temp);
        return res;
    }
   
    public static void main(String arg[]){
       Object a[][] = {{1,2,3,4},
                    {2,3,new Object[]{4,5,new Object[]{1, 2}}}
       }; 
       int res[] = flattenArray(a);
       
       for(int i: res){
           System.out.println(i);
       }
    }
}
