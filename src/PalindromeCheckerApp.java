import java.util.*;

class Palindrome{
    void start(){
        System.out.println("Palindrome app is starting");
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java version : "+javaVersion);
        System.out.println("System initialized successfully");
    }

    void checkStringPalindrome(String s){
        int size = s.length();
        boolean isPalindrome = true;
        for(int i = 0 ; i < size ; i++){
            if(s.charAt(i) != s.charAt(size - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The given string is a palindrome");
        }else{
            System.out.println("The given string is not a palindrome");
        }
    }


}

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        p.start();
        p.checkStringPalindrome("abccba");
    }
}
