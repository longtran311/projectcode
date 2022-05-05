/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.demo3;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LONGPC
 */
public class MangSinhVien {
    public static void main(String[] args) {
        String sv[] = new String[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap sinh vien thu "+(i+1));
            sv[i] = sc.nextLine();
            
        }
        System.out.println("Mang sinh vien: "+Arrays.toString(sv));
        Arrays.sort(sv);
        System.out.println("Mang sinh vien sau khi sap xep"+Arrays.toString(sv));
        }
}
