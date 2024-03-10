import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class OddNumbers{
    public static void main(String[]args){
        Scanner Odd = new Scanner(System.in);

        int oddNumbers[][] = new int[3][3];
        int i, j;
        System.out.println("Enter the first 9 0dd numbers");
        for(i = 0; i < oddNumbers.length; i++){
            for(j = 0; j < oddNumbers[i].length; j++){
                oddNumbers[i][j] = Odd.nextInt();
            }
        }
        
        // Difference betweeen trailing diagonal and leading diagonal
        int trailing = 0, leading = 0;
        for(i = 0; i < oddNumbers.length; i++){
            for(j = 0; j < oddNumbers[i].length; j++){
                if(i == j){
                    leading *= oddNumbers[i][j];
                }
                trailing = oddNumbers[0][2] * oddNumbers[1][1] * oddNumbers[2][0];
            }
        }
        int diff = trailing - leading;
        oddNumbers[1][1] = diff;
        // Assigning leading and trailing into the array
        oddNumbers[0][1] = leading;
        oddNumbers[2][1] = trailing;
        
        // Computing average and standard deviation of the new array
        //Average
        int sum = 0;
        for(i = 0; i < oddNumbers.length; i++){
            for(j = 0; j < oddNumbers[i].length; j++){
                sum += oddNumbers[i][j];
            }
        }
        int average = sum/oddNumbers.length;
        // Assigning average to second row first column
        oddNumbers[1][0] = average;
        // Standard deviation
        double sigmaSquared = 0;
        for(i = 0; i < oddNumbers.length; i++){
            for(j = 0; j < oddNumbers[i].length; j++){
                sigmaSquared += Math.pow(oddNumbers[i][j] - average, 2);
            }
        }
        double standardDeviation = Math.sqrt(sigmaSquared/oddNumbers.length);
        //Assigning standard deviation to second row third column
        oddNumbers[1][2] = (int) standardDeviation; // type casting standardDeviation into int
        
        // sorting the new 2d 3*3 array in descending order
        //Output for now
        for(i = 0; i < oddNumbers.length; i++){
            for(j = 0; j < oddNumbers[i].length; j++){
                System.out.println(oddNumbers[i][j]);
            }
        }
       
    }
}
