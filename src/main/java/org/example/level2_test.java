package org.example;

public class level2_test {
    static void main(String[] args) {

    }
    //1 Prüfung von Nullwerten
    public static Character getFirstLetter(String text){
        if (text == null || text.isEmpty()){
            return null;
        }
        return text.charAt(0);
    }
    // 2 Fehlerfälle testen
    public static double divide(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("b must not be zero");
        }
        return a / b;
    }

}
