/*
 * Problem Statement: Given a matrix if an element in the matrix is 0 then you
 * will have to set its entire column and row to 0 and then return the matrix.
 * 
 * Examples 1:
 * Input:
 * matrix=[[1,1,1],[1,0,1],[1,1,1]]
 * 
 * Output:
 * [[1,0,1],[0,0,0],[1,0,1]]
 * 
 * Explanation:
 * Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
 * 
 * Input:
 * matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * 
 * Output:
 * [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 * 
 * Explanation:
 * Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and
 * 4th column will be set to 0
 */

import java.util.*;

public class Set_Matrix_Zero {
    // Method -01 (Bruite force)
    // static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int
    // i) {
    // // set all non-zero elements as -1 in the row i:
    // for (int j = 0; j < m; j++) {
    // if (matrix.get(i).get(j) != 0) {
    // matrix.get(i).set(j, -1);
    // }
    // }
    // }

    // static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int
    // j) {
    // // set all non-zero elements as -1 in the col j:
    // for (int i = 0; i < n; i++) {
    // if (matrix.get(i).get(j) != 0) {
    // matrix.get(i).set(j, -1);
    // }
    // }
    // }

    // static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>>
    // matrix, int n, int m) {
    // // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix.get(i).get(j) == 0) {
    // markRow(matrix, n, m, i);
    // markCol(matrix, n, m, j);
    // }
    // }
    // }
    // // Finally, mark all -1 as 0:
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix.get(i).get(j) == -1) {
    // matrix.get(i).set(j, 0);
    // }
    // }
    // }
    // return matrix;
    // }

    // public static void main(String[] args) {
    // ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    // matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
    // matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
    // matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

    // int n = matrix.size();
    // int m = matrix.get(0).size();

    // ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

    // System.out.println("The Final matrix is: ");
    // for (ArrayList<Integer> row : ans) {
    // for (Integer ele : row) {
    // System.out.print(ele + " ");
    // }
    // System.out.println();
    // }
    // }

    // Method-02 (Better)
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n]; // row array
        int[] col = new int[m]; // col array

        // Traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;

                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }

        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}