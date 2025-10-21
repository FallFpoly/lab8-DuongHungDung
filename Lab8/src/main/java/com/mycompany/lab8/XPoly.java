/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author ASUS
 */
public final class XPoly {

    // Bài 1: Tính tổng các tham số biến đổi
    public static final double sum(double... x) {
        double tong = 0;
        for (double value : x) {
            tong += value;
        }
        return tong;
    }

    // Bài 2: Tìm số nhỏ nhất
    public static final double min(double... x) {
        if (x.length == 0) throw new IllegalArgumentException("Không có phần tử nào!");
        double min = x[0];
        for (double value : x) {
            if (value < min) min = value;
        }
        return min;
    }

    // Bài 2: Tìm số lớn nhất
    public static final double max(double... x) {
        if (x.length == 0) throw new IllegalArgumentException("Không có phần tử nào!");
        double max = x[0];
        for (double value : x) {
            if (value > max) max = value;
        }
        return max;
    }

    // Bài 3: Viết hoa ký tự đầu mỗi từ
    public static final String toUpperFirstChar(String s) {
        if (s == null || s.isEmpty()) return s;
        String[] words = s.trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                char first = words[i].charAt(0);
                String upper = String.valueOf(first).toUpperCase();
                words[i] = upper + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }
}
