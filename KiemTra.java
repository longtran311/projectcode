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
public class KiemTra {
    public static void main(String[] args) {
        float N;
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        System.out.println("Nhap so can kiem tra:");
        N = sc.nextFloat();
        for (int i = 2; i < N-1; i++) {
            if(N%i == 0){
                ok = false;
            break;
            }
         }
        if(ok == true){
            System.out.println(N+" la so nguyen to");
        }else   System.out.println(N+" khong phai la so nguyen to");
    }
}
