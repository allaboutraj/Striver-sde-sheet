/*
 * Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

Examples
Examples 1:
Input:
 matrix=[[1,1,1],[1,0,1],[1,1,1]]

Output:
 [[1,0,1],[0,0,0],[1,0,1]]

Explanation:
 Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
 
Input:
 matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]

Output:
[[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Explanation:
Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
 * 
 */

import java.util.*;

public class PascalTriangle {

    // Method -01
    // public static long nCr(int n, int r) {
    // long res = 1;

    // // calculating nCr:
    // for (int i = 0; i < r; i++) {
    // res = res * (n - i);
    // res = res / (i + 1);
    // }
    // return res;
    // }

    // public static int pascalTriangle(int r, int c) {
    // int element = (int) nCr(r - 1, c - 1);
    // return element;
    // }

    // public static void main(String[] args) {
    // int r = 5; // row number
    // int c = 3; // col number
    // int element = pascalTriangle(r, c);
    // System.out.println("The element at position (r,c) is: " + element);
    // }

    // Method-02
    static void pascalTriangle(int n) {
        long ans = 1;
        System.out.print(ans + " "); // printing 1st element

        // Printing the rest of the part:
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}
