package by.epam.module02.twodimensional_array;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего*/

public class Task1A {

    public static void outOddColumns(int[][] a) {
        for (int i = 0; i < a.length; i += 2) {
            if (a[0][i] > a[a[i].length - 1][i]) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[j][i] + " ");
                }
            }
        }
        System.out.println();
    }

}
