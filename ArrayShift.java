
import java.util.*;
import java.lang.*;
    class ArrayShift {
        public static void main(String args[] ) throws Exception {

            System.out.println("Enter the number of test cases: ");
            Scanner sc = new Scanner(System.in);
            int testcases = Integer.parseInt(sc.nextLine());  // Because the Scanner class always leaves a \n in the buffer, it's recommended to use nextLine() while accepting mixed inputs
            int iteration = 1;
            while(iteration<=testcases){
                System.out.println("Enter the number elements in the array and the number of steps of rotation: ");
                String ip=sc.nextLine();
                String[] ip1 = ip.split("\\s+");

                int[] intArray = new int[ip1.length];
                for(int i=0;i< ip1.length;i++){
                    String num = ip1[i];
                    intArray[i] = Integer.parseInt(num);
                }

                int numberOfElements = intArray[0];
                int stepsOfRotation = intArray[1];
                System.out.println("Now, enter the elements of the array: ");
                String ip2= sc.nextLine();
                String[] elements = ip2.split("\\s+");
                int[] intArray2 = new int[elements.length];

                for( int i=0;i<elements.length;i++){
                    String num2 = elements[i];
                    intArray2[i] = Integer.parseInt(num2);


                }
                stepsOfRotation%=numberOfElements;
                int p=0;
                //Logic for steps of rotation
                for(int i=0;i<intArray2.length; i++){
                    p= intArray2[(i+numberOfElements-stepsOfRotation)%numberOfElements];
                    System.out.print(p+"\t");
                }
                System.out.println();

                iteration++;
            }


        }
    }

