import java.util.Scanner;

public class PasswordComplexityVersionIII {
    public static boolean isComplex(String pwd){
        return pwd.length()>=6 && pwd.matches(".*\\d.*") && pwd.matches(".*[a-z].*") && pwd.matches(".*[A-Z].*");


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String ip = sc.next();
        if(isComplex(ip)){
            System.out.println("The Password is Complex :)");
        }
        else {
            System.out.println("Weak Password :( \nPlease Reset it!");
        }

    }
}
