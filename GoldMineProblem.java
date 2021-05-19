import java.util.Random;
import java.util.Scanner;




public class GoldMineProblem {

    
    public static void main(String[] args) {
        System.out.println("Welcome to Gold Mine Problem :)");
        System.out.println("Enter the number of Levels :  "); // Number of levels implies the number of rows
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Enter the number of Steps : ");  // Number of Steps implies the number of columns
        int M = sc.nextInt();

        int goldTable[][] = new int[N][M];

        for(int i=0;i<N;i++){
            System.out.println("Enter the points in the level "+i+" : ");
            for(int j=0;j<M;j++){
                System.out.println("Enter the point "+j+" : ");
                goldTable[i][j] = sc.nextInt();
            }
        }
        System.out.println("Maximum Gold Points to mine : "+mostGoldPoints(goldTable, N, M)); // Send the array of gold points and the dimensions for final manipulations
        
    }
    
    
    public static int mostGoldPoints(int[][] goldTable, int n, int m){
        
       // Create a dummy array goldPoints[][] of same size as goldTable[n][m] 
       int goldPoints[][] = new int[n][m];
        
       // Initialize all the values in the dummy array to zero 
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               goldPoints[i][j]=0;
           }
       }
        
        for(int j=m-1;j>=0;j--){  // Since we'll be traversing from the top to bottom and column wise, we loop with column variable first and then follows row variable
            for(int i=0;i<=n-1;i++){
                
                // Gold collected on going to the cell on the right(->)
                int right = (j == m-1)? 0:goldPoints[i][j+1];
                
                // Gold collected on going to the cell to right up (/)
                int right_up = (i==0 || j == m-1)? 0:goldPoints[i-1][j+1];
                
                
                // Gold collected on going to the cell to right down (\)
                int right_down = (i == n-1 || j == m-1)? 0:goldPoints[i+1][j+1];
                
                
                // The max amount of gold collected will be the max value in first column of all row
                goldPoints[i][j] = goldTable[i][j]+Math.max(right, Math.max(right_up, right_down));
                
            }
        }
        
        
        int res = goldPoints[0][0];
        
        for(int i=0; i<n;i++){
            res=Math.max(res, goldPoints[i][0]);
            
        }
        
        return res;
        

    }
    
    
}
