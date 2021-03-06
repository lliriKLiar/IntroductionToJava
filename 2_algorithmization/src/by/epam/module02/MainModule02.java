package by.epam.module02;

import java.util.Arrays;

import by.epam.module02.onedimensional_array.*;
import by.epam.module02.twodimensional_array.*;

public class MainModule02 {

    public static void main(String[] args) {
        /*System.out.println(Task1.getSumOfElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
        double[] inputD = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Task2.replaceOnZ(inputD, 5));
        System.out.println(Arrays.toString(inputD));
        Task3.countNumbers(new float[]{1, -1, 2, -2, 3, -3, 0, 1.1F, -1.1F, 2.1F, -2.2F, 0, 0, 0, 0});
        double[] inputDForSwap = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Task4.swapMinMax(inputDForSwap);
        System.out.println(Arrays.toString(inputDForSwap));
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 0};
        Task5.printIf(array);
        double[] sdf = new double[10];
        for (int i = 0; i < sdf.length; i++) {
            sdf[i] = i + 1;
        }
        System.out.println(Task6.sumOfSequenceNumbers(sdf));
        System.out.println(Task7.maxOfSums(new double[]{1, 2, 3, 4, 55, 6, 7, 8, 9, 11}));
        int[] ints1 = new int[]{0, 2, 1, 3, 1, 4, 1, 6, 1, 8, -1};
        System.out.println(Arrays.toString(Task8.getNewSequence(ints1)));
        System.out.println();
        int[] ints2 = {1, 3, 3, 3, 5, 5, 5, 6, 6, 6, 2, 2};
        System.out.println(Task9.getDesiredNumber(ints2));
        Task10.compressArray(ints2);
        System.out.println(Arrays.toString(ints2));
        Task1S.outOddColumns(new int[][]{{9, 2, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1, 3}});
        Task2A.outDiagonalValues(new int[][]{{9, 2, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1, 3}});
        Task3A.getKAndP(new int[][]{{9, 2, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1, 3}, {8, 1, 3, 1}}, 1, 5);
        int[][] matr1 = Task4A.createMatrix(10);
        //Связанные строки в матрице
        int[][] matr2 = Task4A.createMatrixFaster(10);
        int[][] matr3 = Task5A.createMatrix1(20);
        Task6A.createMatrix(10);
        outTwoDimensionalArray(Task7A.getMatrixByRule(4));
        int[][] dsf = new int[][]{{1, 2, 3,4}, {5, 6, 7,8}, {9,10,11,12}};
        Task8A.replaceColumns(dsf);
        outTwoDimensionalArray(dsf);
        System.out.println(Task9A.getColumnNumberWithMaxSumOfElement(dsf));
        Task10A.serchPositiveElements(dsf);*/
        Task11A.createMatrix();
    }

    public static void outTwoDimensionalArray(double[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void outTwoDimensionalArray(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println();
    }

    public static void outTwoDimensionalArray(long[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println();
    }

    /*for
    tests
    long sum = 0;
        for (int i = 0; i < 1000; i++) {
            long asd = System.nanoTime();
            int[][] matr1 = Task4A.createMatrix(6);
            long asdf = System.nanoTime();
            sum += (asdf - asd);
        }
        System.out.println((double)sum/1000.0);
    */

}
