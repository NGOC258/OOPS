/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH2;

/**
 *
 * @author HONG NGOC
 */
public class QuocGia {
   private String tenNuoc;
   private String thuDo;
   private int  danSo;
   private int dienTich;

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public String getThuDo() {
        return thuDo;
    }

    public void setThuDo(String thuDo) {
        this.thuDo = thuDo;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public QuocGia(String tenNuoc, String thuDo, int danSo, int dienTich) {
        this.tenNuoc = tenNuoc;
        this.thuDo = thuDo;
        this.danSo = danSo;
        this.dienTich = dienTich;
    }

   

 

    @Override
    public String toString() {
        return "QuocGia{" + "tenNuoc=" + tenNuoc + ", thuDo=" + thuDo + ", danSo=" + danSo + ", dienTich=" + dienTich + '}';
    }
    
    
    
    
   
   
}
