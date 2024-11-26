/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author HONG NGOC
 */
public class bai4 {
    public static void main(String[] args) {
        try{
        PhanSo ps1= new PhanSo(1,2);
        PhanSo ps2= new PhanSo(2,4);
        
        System.out.println(ps1);
        System.out.println(ps2);
        System.out.printf("Ket qua cong: %s\n", ps1.cong(ps2));
        System.out.printf("Ket qua tru: %s\n",ps2.tru(ps1));
        System.out.printf("Ket qua nhan: %s\n", ps1.nhan(ps2));
        System.out.printf("Ket qua chia: %s\n", ps1.chia(ps2));
        if ( ps1.soSanh(ps2)==1)
                System.out.println("Lon hon");
        else if (ps1.soSanh(ps2)==-1)
                System.out.println("Nho hon");
        else
                System.out.println("Bang nhau");
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
