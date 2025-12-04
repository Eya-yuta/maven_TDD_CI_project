package org.example;

public class TDD {
    public static void main(String[] args) {

    }
    //sum
    public static int sum(int a,int b){
        return a+b;
    }
    //is Even
    public static boolean isEven(int a){
        return a%2==0;
    }
    //getFirstCharacter
    public static Character getFirstCharacter(String str){
        if(str==null||str.isEmpty()){
            return null;
        }
        return str.charAt(0);
    }
    //reverseString
    public static String reverseString(String str){
        if(str==null||str.isEmpty()){
            return str;
        }
        StringBuilder reversed = new StringBuilder();//StringBuilder is mutable,
        // so you can append characters without creating new objects every time
        for(int i=str.length()-1;i>=0;i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();//convert to string again

    }
    //isPalindrome
    public static boolean isPalindrome(String str){
        if(str==null||str.isEmpty()){
            return false;
        }
        str=str.toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            return true;
        }
        else {
            return false;
        }
    }
    //countVowels
    public static int countVowels(String str){
        if(str==null||str.isEmpty()){
            return 0;
        }
        str=str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'||c=='o'){
                count++;
            }
        }
        return count;
    }
}
