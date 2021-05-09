
import java.util.Scanner;

public class PasswordComplexity {
    public static void isComplex(String pwd){
        int capCount=0;
        int smallCount =0;
        int specialCount =0;
        int numCount=0;
        if(!pwd.isEmpty()) {   //To make sure the user didn't enter an empty password

            if (pwd.length() < 6) {
                System.out.println("The password is too short!");

            } else {
                for(int i=0;i<pwd.length();i++){
                    for( char j=33;j<48;j++) {          // To check whether the password has at least one special character
                        if (pwd.charAt(i) == j) {
                            specialCount++;
                        }
                    }
                    if(pwd.charAt(i) == '@' || pwd.charAt(i) == '^'){
                        specialCount++;
                    }

                    for( char j=48;j<58;j++) {
                        if (pwd.charAt(i) == j) {       // To check whether the password has at least one digit
                            numCount++;
                        }
                    }
                    for( char j=65;j<91;j++) {
                        if (pwd.charAt(i) == j) {       // To check whether the password has at least one Capital Letter
                            capCount++;
                        }
                    }
                    for( char j=97;j<123;j++) {
                        if (pwd.charAt(i) == j) {       // To check whether the password has at least one Small Letter
                            smallCount++;
                        }
                    }

                }
            }
        }
        else {
            System.out.println("Please enter a password not an empty string!");
        }
        if(smallCount>=1 && numCount>=1 && capCount>=1 && specialCount >=1){
            System.out.println("This password is Complex :)");
        }
        else{
            System.out.println("Weak Password. Please kindly reset!");
        }


    }

    /*
    The Password should abide by the following rules to be complex:
    1. At Least of 6 characters in length
    2. At least one Capital Letter
    3. At least one Small Letter
    4. At least one number
    5. At least one Special Character
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String ip = sc.next();
        isComplex(ip);

    }
}
