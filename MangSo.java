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
public class MangSo {
    public static void main(String[] args) {
        int mang[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan tu thu "+(i+1));
            mang[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu cua mang: "+Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println("Cac phan tu cua mang sau khi sap xep: "+Arrays.toString(mang));
        int min = mang[0];
        for (int i = 1; i < mang.length; i++) {
            min = Math.min(min, mang[i]);
        
        }
        System.out.println("Mang co gia tri nho nhat la: "+min);
        int sum = 0, count = 0;
        for (int i = 0; i < mang.length; i++) {
            if(mang[i]%3==0){
                 sum += mang[i];
                 count++;
            }
            
        }
        float avg = (float) sum/count;
        System.out.println("Gia tri trung binh cong cua cac phan tu:"+sum);
        System.out.println("Gia tri trung binh cua cac phan tu:"+avg);
     }
}
