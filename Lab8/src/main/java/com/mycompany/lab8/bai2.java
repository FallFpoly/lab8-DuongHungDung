/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }

        System.out.println("Gia tri nho nhat: " + XPoly.min(arr));
        System.out.println("Gia tri lon nhat: " + XPoly.max(arr));
    }
}
