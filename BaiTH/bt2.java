/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH;

import java.util.Scanner;

/**
 *
 * @author HONG NGOC
 */
public class bt2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hay nhap ban kinh");
        double banKinh= sc.nextDouble();
         double dienTich= Math.PI *Math.pow(banKinh, 2);
         double chuVi= 2*Math.PI * banKinh;
         System.out.printf("Dien tich hinh tron la: %08.2f\n",dienTich);
          System.out.printf("Chu vi hinh tron la: %08.2f\n",chuVi);

         
    }
    
}
