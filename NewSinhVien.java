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
public class NewSinhVien {
    public static void main(String[] args) {
        String sv[] = new String[5];
        float diem[] = new float[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap sinh vien thu "+(i+1));
            sv[i] = sc.nextLine();
            System.out.println("Nhap diem sinh vien thu "+(i+1));
            diem[i] = sc.nextFloat();
            sc.nextLine();
        }
        System.out.println("Mang sinh vien: "+Arrays.toString(sv));
        System.out.println("Mang diem sinh vien: "+Arrays.toString(diem));
        for (int i = 0; i < diem.length-1; i++) {
            for (int j = i+1; j < diem.length; j++) {
                if (diem[i]<diem[j]){
                    float temp = diem[j];
                    diem[j] = diem[i];
                    diem[i] = temp;
                    String st = sv[j];
                    sv[j] = sv[i];
                    sv[i] = st;
                }
            }
        }
               System.out.println("Mang sinh vien sau khi sap xep"+Arrays.toString(sv));
                System.out.println("Mang diem sinh vien sau khi sap xep"+Arrays.toString(diem));
        }
}
