/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        sc.nextLine();

        // Gọi các hàm trong XPoly
        System.out.println("Tong = " + XPoly.sum(arr));
        System.out.println("Nho nhat = " + XPoly.min(arr));
        System.out.println("Lon nhat = " + XPoly.max(arr));

        System.out.print("Nhap chuoi can viet hoa: ");
        String s = sc.nextLine();
        System.out.println("Chuoi sau khi viet hoa: " + XPoly.toUpperFirstChar(s));
    }
}