package geekbrains.homework;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static void createArr (String[][] array, Scanner scanner, int row, int col) {
        if (row!=4||col!=4) throw new SizeException(row,col);
        System.out.println("Массив: ");

                Random random = new Random();
                for (int i=0;i<array.length;i++) {
                    for (int j = 0;j<array[i].length;j++) {
                        array[row][col] = String.valueOf(random.nextInt());
                    }
                    }
        printArr(array);
        calcArr(array, row, col);
    }

    private static int calcArr(String[][] array, int row, int column) {
        int sum = 0;
        int[][] arrayInt = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(array[i][j]);
                    sum += arrayInt[i][j];
                } catch (NumberFormatException e) {
                    throw new DataException(i, j);
                }
            }
        }
        printArrInt(arrayInt);
        return sum;
    }

    private static void printArr(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void printArrInt(int[][] array) {
        System.out.println("This is arr Int ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] arr = new int[4][4];
    int col;
    int row;
    row = scanner.nextInt();
    col = scanner.nextInt();
    String[][] newArray = new String[row][col];
    try {
        createArr(newArray, scanner, row, col);
        System.out.println("Sum is " + +calcArr(newArray, row, col));
    } catch (SizeException e) {
        e.printStackTrace();
    } catch (DataException e) {
        e.printStackTrace();
    }
    System.out.println("END");
    }

    }
