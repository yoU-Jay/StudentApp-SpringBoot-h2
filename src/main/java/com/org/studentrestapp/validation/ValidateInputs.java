package com.org.studentrestapp.validation;

public class ValidateInputs {
    public static boolean isAlphabetsOnly(String input){
            char[] chars = input.toCharArray();
            boolean isOnlyLetters = true;
            for(char c: chars) {
                if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                    isOnlyLetters = false;
                    break;
                }
            }
            return isOnlyLetters;
        }
    public boolean isAlphabetsandNumbersOnly(String input){
        char[] chars = input.toCharArray();
        boolean isOnlyLetters = true;
        for(char c: chars) {
            if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= 0 && c <= 9) ) {
                isOnlyLetters = false;
                break;
            }
        }
        return isOnlyLetters;
    }
}
