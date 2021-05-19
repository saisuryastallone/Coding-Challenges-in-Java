
package gold.mine.problem;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class GoldMineProblem {

    
    public static void main(String[] args) {
        System.out.println("Welcome to Gold Mine Problem :)");
        System.out.println("Enter the number of Levels :  ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Enter the number of Steps : ");
        int M = sc.nextInt();

        int goldTable[][] = new int[N][M];

        for(int i=0;i<N;i++){
            System.out.println("Enter the points in the level "+i+" : ");
            for(int j=0;j<M;j++){
                System.out.println("Enter the point "+j+" : ");
                goldTable[i][j] = sc.nextInt();
            }
        }
        System.out.println("Maximum Gold Points to mine : "+mostGoldPoints(goldTable, N, M));
        
    }
    
    
    public static int mostGoldPoints(int[][] goldTable, int n, int m){
        
    
       
        
        int goldPoints[][] = new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               goldPoints[i][j]=0;
           }
       }
        
        for(int j=m-1;j>=0;j--){
            for(int i=0;i<=n-1;i++){
                int right = (j == m-1)? 0:goldPoints[i][j+1];
                
                int right_up = (i==0 || j == m-1)? 0:goldPoints[i-1][j+1];
                
                int right_down = (i == n-1 || j == m-1)? 0:goldPoints[i+1][j+1];
                
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
