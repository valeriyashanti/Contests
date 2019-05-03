import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private int[][] matrix;


    public void calculate() {
        try {
            matrix = readFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int minRows[] = minOfRow();
        int minCols[] = minOfCol();
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == minRows[i] && matrix[i][j] == minCols[j]) count++;
            }
        }
        System.out.println(count);
    }

    private int[][] readFromFile() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[][] destination = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                destination[i][j] = scan.nextInt();
            }
        }
        return destination;
    }

    private int[] minOfRow() {
        int[] minimums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            minimums[i] = Arrays.stream(matrix[i]).min().getAsInt();
        }
        return minimums;
    }

    private int[] minOfCol() {
        int[] minimums = new int[matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            minimums[i] = Integer.MAX_VALUE;
            for (int[] val : matrix) {
                if (val[i] < minimums[i]) minimums[i] = val[i];
            }
        }
        return minimums;
    }
}