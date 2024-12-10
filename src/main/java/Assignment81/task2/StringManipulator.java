package Assignment81.task2;

import java.util.Scanner;

public class StringManipulator {
    private String str1;
    private String str2;
    private String str;
    private String subString;

    public StringManipulator(String str1, String str2, String str, String subString){
        this.str1 = str1;
        this.str2 = str2;
        this.str = str;
        this.subString = subString;

    }

    public String concatenate(){
        if(str1.isEmpty() || str2.isEmpty()){
            return "enter valid string";
        }
        return str1 + str2;
    }

    public int findLength(){
        int length = 0;
        for (char c : str.toCharArray()){
            length++;
        }
        return length;
    }

    public String convertToUpperCase(){
        return str.toUpperCase();
    }
    public String convertToLowerCase(){
        return str.toLowerCase();
    }
    public boolean containsSubstring(){
        if (str.contains(subString)){
            return true;
        }else {
            return false;
        }
    }


}



