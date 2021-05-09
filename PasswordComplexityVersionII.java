import java.util.Scanner;

public class PasswordComplexityVersionII {
    public static boolean isComplex(String pwd){
        boolean hasLowercaseLetter = false;
        boolean hasUppercaseLetter = false;
        boolean hasDigit = false;
        for (int i=0;i<pwd.length();i++){
            if(Character.isDigit(pwd.charAt(i))){
                hasDigit =true;
            }
            else if(Character.isUpperCase(pwd.charAt(i))){
                hasUppercaseLetter = true;
            }
            else if(Character.isLowerCase(pwd.charAt(i))){
                hasLowercaseLetter = true;
            }

        }
        return hasDigit && hasLowercaseLetter && hasUppercaseLetter;


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
