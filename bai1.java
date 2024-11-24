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
public class bt3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Hay nhp so thang");
        int t= sc.nextInt();
        switch (t){
            case 1  :case 3:case 5: case 7: case 8:case 10: case 12:
                System.out.println("La nhung thang co 31 ngay");
                break;
            case 4 :case 6: case 9: case 11:
                System.out.println("La nhung thang co 30 ngay");
                break;
            case 2:
                System.out.println("Thang co 28 hoac 29 ngay");
                break;
            default:
                System.out.println("Khong hop le!!Hay nhap lai");
            
            
        }
                
    }
}
//Lạ lùng em hỡi, để tui chạy tren máy tui, ơ được
