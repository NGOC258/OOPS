/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTH2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HONG NGOC
 */
public class QLHS {
    private ArrayList<HocSinh> arr;
    public QLHS(String path){
        arr= new ArrayList<>();
        try{
            SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
            File f= new File(path);
            Scanner sc= new Scanner(f);
            while(sc.hasNextLine()){
            String[] info= sc.nextLine().split(",");
            HocSinh hs = new HocSinh (info[0],df.parse(info[1]),info[2],
                    Double.parseDouble(info[3]),
                    Double.parseDouble(info[4]),
                    Double.parseDouble(info[5]));
            arr.add( hs);
            }  
        }catch(FileNotFoundException| ParseException e){
            System.out.println(e.getMessage());
        }
    }
     
    public void them(HocSinh hs, String path){
    this.arr.add(hs);
    SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
    try{
        FileWriter f= new FileWriter(path, true);
         PrintWriter writer= new PrintWriter(f);
         writer.printf("\n%s, %s, %s, %.1f, %.1f, %.1f", hs.getHoTen(), df.format(hs.getNgaySinh()), hs.getQueQuan(), hs.getToan(), hs.getVan(), hs.getAnh());
         writer.close();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
    }
    
    
    
    
    
    
    
    
    
    
    
}
