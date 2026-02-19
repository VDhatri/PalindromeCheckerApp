import java.util.*;

class Palindrome {
    void start() {
        System.out.println("Palindrome app is starting");
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java version : " + javaVersion);
        System.out.println("System initialized successfully");
    }

    void checkStringPalindrome(String s) {
        int size = s.length();
        boolean isPalindrome = true;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != s.charAt(size - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }

    void checkStringReverse(String s) {
        int size = s.length();
        String reverse = "";
        for (int i = size - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println("The given string is a palindrome. Checked using reverse function.");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }

    void charArrayPalindrome(String s) {
        int size = s.length();
        char[] reverse = new char[size];
        for (int i = 0; i < size; i++) {
            reverse[i] = s.charAt(i);
        }
        int start = 0;
        int end = size - 1;
        int mid = (start + end) / 2;
        boolean isPalindrome = true;
        while (start <= mid) {
            if (reverse[start] == reverse[end]) {
                start++;
                end--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome(checked till middle)");
        } else {
            System.out.println("The string is not a palindrome(checked till middle)");
        }
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        p.start();
        String s = "abcba";
        p.checkStringPalindrome(s);
        p.checkStringReverse(s);
        p.charArrayPalindrome(s);
    }
}
