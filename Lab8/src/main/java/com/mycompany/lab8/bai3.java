/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        String name = sc.nextLine();

        System.out.println("Sau khi viet hoa: " + XPoly.toUpperFirstChar(name));
    }
}