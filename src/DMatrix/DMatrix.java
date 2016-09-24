package DMatrix;

import java.util.Scanner;
import java.io.*;

public class DMatrix {
    public static void main(String[] args) {
        int a1;
        int a2;
        int b1;
        int b2;
        int[][] mat1, mat2, mat3;
        mat1 = new int[100][100];
        mat2 = new int[100][100];
        mat3 = new int[100][100];

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы A: ");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        System.out.println("Введите размер матрицы B: ");
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        if (b1 != a2) {
            System.out.println("Такие матрицы нельзя умножать.");
            System.exit(0);
        } else {

            System.out.println("Введите элементы матрицы A: ");
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print("а[" + i + "][" + j + "]=");
                    mat1[i][j] = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                }
            }

            System.out.println("Введите элементы матрицы B: ");
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print("b[" + i + "][" + j + "]=");
                    mat2[i][j] = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                }
            }
            int i, j, t;
            for (i = 0; i <= 2; i++) {
                for (j = 0; j <= 2; j++) {
                    for (t = 0; t <= 2; t++) {
                        mat3[i][j] += mat1[i][t] * mat2[t][j];
                    }
                }
            }

            System.out.println();
            System.out.println("A*B=");
            for (i = 0; i <= 2; i++) {
                for (j = 0; j <= 2; j++) {
                    System.out.print(mat3[i][j] + "\t");
                }
                System.out.println();
            }
        }

    }
}
