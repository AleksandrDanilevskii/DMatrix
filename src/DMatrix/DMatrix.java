package DMatrix;

import java.util.Scanner;
//import java.io.*;
import java.io.IOException;
//import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DMatrix {
    public static void main(String[] args) {
        int[][] a = new int[100][100];
        int[][] b = new int[100][100];
        int[][] c = new int[100][100];
        int widthA = 0;
        int widthB = 0;
        int heightA = 0;
        int heightB = 0;
        Scanner sc = new Scanner(System.in);

        //чтение матрицы А:
        try {
            File file = new File("C:\\Users\\Notebook\\IdeaProjects\\DMatrix\\DMatrixА.txt");
            FileReader fr = new FileReader(file);//создаем объект
            BufferedReader reader = new BufferedReader(fr);//создаем BufferedReader с существующего FileReader для построчного считывания
            String line = reader.readLine();//считываем первую строчку
            String[] str = line.split(" ");
            widthA = str.length; //число столбцов
            heightA = 0; //номер строки
            while (line != null) {
                str = line.split(" "); //создаем массив s слов
                for (int j = 0; j < widthA; j++) { //заполнение строки массива
                    int number = Integer.parseInt(str[j]); //strtoint
                    a[heightA][j] = number;
                }
                line = reader.readLine();// считываем остальные строки в цикле
                heightA++;
            }
            for (int i = 0; i < heightA; i++) {//печать массива
                for (int j = 0; j < widthA; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        try { //чтение матрицы B:
            File file = new File("C:\\Users\\Notebook\\IdeaProjects\\DMatrix\\DMatrixB.txt");
            FileReader fr = new FileReader(file);//создаем объект FileReader для объекта File
            BufferedReader reader = new BufferedReader(fr);//создаем BufferedReader с существующего FileReader для построчного считывания
            String line = reader.readLine();// считаем сначала первую строку
            String[] str = line.split(" ");
            widthB = str.length; //число столбцов
            heightB = 0; //число строк
            while (line != null) {
                str = line.split(" "); //создаем массив s слов
                for (int j = 0; j < widthB; j++) { //заполнение строки массива
                    int number = Integer.parseInt(str[j]); //strtoint
                    b[heightB][j] = number;
                }
                line = reader.readLine();// считываем остальные строки в цикле
                heightB++;
            }
            for (int i = 0; i < heightB; i++) { //печать массива
                for (int j = 0; j < widthB; j++) {
                    System.out.print(b[i][j] + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (heightB != widthA) { //умножение
            System.out.println("Умножение таких матриц невозможно.");
            System.exit(0);
        } else {
            for (int i = 0; i < heightA; i++) {
                for (int j = 0; j < widthB; j++) {
                    //c[i][j]=0;
                    for (int t = 0; t < widthA; t++) {
                        c[i][j] += a[i][t] * b[t][j];
                    }
                }
            }
        }
        System.out.println(); //вывод умножение
        System.out.println("A*B=");
        for (int i = 0; i < heightA; i++) {
            for (int j = 0; j < widthB; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
