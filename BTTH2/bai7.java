/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH2;

import java.io.FileNotFoundException;

/**
 *
 * @author HONG NGOC
 */
public class bai7 {
    public static void main(String[] args) throws FileNotFoundException {
        OlympicTokyo ds = new OlympicTokyo ("D:\\Top20TokyoInfo.txt","D:\\Top20Tokyo.txt");
       // ds.timKiemTenQG("My");
        //ds.timKiemTheoV(20);
        ds.inQuocGia("My","D:\\USA.txt");
    }
}