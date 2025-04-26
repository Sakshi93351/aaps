import java.util.*;

class MatrixElement {
    int value;
    int row;
    int col;

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

        for (int i = 0; i < n; i++) {
            minHeap.add(new MatrixElement(matrix[i][0], i, 0));
        }

        for (int i = 1; i < k; i++) {
            MatrixElement current = minHeap.poll();
            if (current.col + 1 < n) {
                minHeap.add(new MatrixElement(matrix[current.row][current.col + 1], current.row, current.col + 1));
            }
        }

        return minHeap.poll().value;
    }

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
// Time Complexity: O(k log n)
// Space Complexity: O(n) for the min-heap

