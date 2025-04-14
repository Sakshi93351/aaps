import java.util.*;

class MatrixElement {
    int value;
    int row;
    int col;

    // Constructor to store the value and its position in the matrix
    MatrixElement(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }
}

public class ques15 {

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<MatrixElement> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.value));

        // Insert the first element of each row into the heap
        for (int i = 0; i < n; i++) {
            minHeap.add(new MatrixElement(matrix[i][0], i, 0));
        }

        // Extract the min element k times
        for (int i = 1; i < k; i++) {
            MatrixElement current = minHeap.poll();
            if (current.col + 1 < n) {
                // If the next element in the row exists, add it to the heap
                minHeap.add(new MatrixElement(matrix[current.row][current.col + 1], current.row, current.col + 1));
            }
        }

        // The k-th smallest element will be at the root of the heap
        return minHeap.poll().value;
    }

    // Main method
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };

        int k = 8;
        System.out.println("The " + k + "-th smallest element is: " + kthSmallest(matrix, k));
    }
}

