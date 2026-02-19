import java.util.*;

class Palindrome{
    void start(){
        System.out.println("Palindrome app is starting");
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java version : "+javaVersion);
        System.out.println("System initialized successfully");
    }

}

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        p.start();
    }
}
