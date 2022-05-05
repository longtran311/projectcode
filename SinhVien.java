/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.poly.demo3;

import java.util.Scanner;

/**
 *
 * @author LONGPC
 */
public class SinhVien {

    public static void main(String[] args) {
        float diem = -1;
        
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap diem sinh vien vao");
            diem = sc.nextFloat();
            
            if(diem < 0 || diem > 10){
                System.out.println("Diem nhap bi sai vui long nhap lai");
            }
        }while (diem <0 || diem > 10);
        
        System.out.println("Diem vua nhap la:"+diem);

    }
}
