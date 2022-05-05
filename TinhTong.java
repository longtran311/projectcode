/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.demo3;

import java.util.Scanner;

/**
 *
 * @author LONGPC
 */
public class TinhTong {
    public static void main(String[] args) {
        
   
    int[] mang = new int[10];
    Scanner sc = new Scanner(System.in);
    int i = 0;
    do{
            System.out.printf("mang[%d]: ",i);
            mang[i] = sc.nextInt();
            i++;
        }while (i<10);
    int sum = 0;
    for(int item: mang){
        sum += item;
    }
        System.out.println("Tong cac phan tu mang:"+sum);
        float avg = (float) sum/ mang.length;
        
        System.out.println("Trung binh cong cac phan tu mang: "+avg);
    }    
}