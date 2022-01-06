package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size1, size2;
        Scanner scanner = new Scanner(System.in);


//        Khởi tạo mảng 1
        do {
            System.out.println("Nhập kích thước mảng 1:");
            size1 = scanner.nextInt();
            if (size1 > 10)
                System.out.println("Số lượng không quá 10");
        } while (size1 > 10);
        int array1[] = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }

//        Khởi tạo mảng 2
        do {
            System.out.println("Nhập kích thước mảng 2:");
            size2 = scanner.nextInt();
            if (size2 > 10)
                System.out.println("Số lượng không quá 10");
        } while (size2 > 10);
        int array2[] = new int[size2];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element" + (j + 1) + " : ");
            array2[j] = scanner.nextInt();
            j++;
        }

//     in 2 mảng ra màn hình
        System.out.print("Mảng 1: ");
        for (i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

        System.out.println("");

        System.out.print("Mảng 2: ");
        for (j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }

        System.out.println("");


//        Tạo mảng mới có độ dài bằng mảng 1 và mảng 2 cộng lại
        int length = array1.length + array2.length;
        int[] array3 = new int[length];
        for (i = 0; i < array1.length; i++){
                array3[i] = array1[i];
            }
            for (i = 0; i < array2.length; i++){
                array3[array1.length + i] = array2[i];
            }


        //In mảng 3
        System.out.println("Mảng 3: ");
        for (i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }

}
