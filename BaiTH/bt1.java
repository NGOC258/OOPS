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
public class bt1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in);
        System.out.println("Hay nhap ten cua ban");
        String ten= sc.nextLine();
        System.out.println("Hay nhap tuoi cua ban");
        int tuoi= sc.nextInt();
        System.out.printf("Chao ban %s, %d tuoi ",ten,tuoi);
    }
    
}
