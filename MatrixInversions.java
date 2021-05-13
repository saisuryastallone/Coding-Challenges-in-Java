import java.util.Scanner;

public class MatrixInversions {
        public static void main(String args[] ) throws Exception {

            System.out.println("Enter the number of test cases: ");
            Scanner sc = new Scanner(System.in);
            int testcases= Integer.parseInt(sc.nextLine());

            while(testcases!=0){
                System.out.println("Enter the size of the matrix: ");
                int matrixSize = Integer.parseInt(sc.nextLine());

                System.out.println("Enter the elements into the matrix: ");
                int[][] matrixElements = new int[matrixSize][matrixSize];
                String num;
                for(int i=0;i<matrixSize;i++){
                    String elements = sc.nextLine();
                    String[] elem = elements.split("\\s+");
                    for(int j=0;j<matrixSize;j++){
                        num = elem[j];
                        matrixElements[i][j] = Integer.parseInt(num);
                    }

                }

                int numberOfInversions=0;
                for(int i=0;i<matrixSize;i++){
                    for(int j=0;j<matrixSize;j++){

                        for(int p=i;p<matrixElements.length;p++){
                        for (int q=j;q<matrixElements.length;q++){
                            if(matrixElements[i][j]>matrixElements[p][q]){
                                numberOfInversions++;
                            }


                            }
                        }

                    }
                }

                System.out.println("The number of Inversions: "+numberOfInversions);

                testcases--;

            }


        }
}


