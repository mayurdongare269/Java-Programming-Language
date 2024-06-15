import java.util.*;

public class MatrixLargest {

    public static void PrintLargest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                // largest = Math.max(largest, matrix[i][j]);
                if(matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest is : " + largest);
    }

    public static boolean search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        //input
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
             }
        }

        //output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        PrintLargest(matrix);
        
        System.out.println(search(matrix, 5));
    }
}
