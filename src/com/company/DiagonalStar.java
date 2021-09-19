package com.company;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            int rowCount = 1;

            while (rowCount <= number) {
                int columnCount = 1;

                while (columnCount <= number) {
                    if (rowCount == 1 || rowCount == number || columnCount == 1 || columnCount == number || rowCount == columnCount || columnCount == number - rowCount + 1) {
                        System.out.print("*");
                        columnCount++;
                    } else {
                        System.out.print(" ");
                        columnCount++;
                    }
                }
                System.out.println();
                rowCount++;
            }
        }
    }
}
