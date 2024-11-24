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
public class bt5 {
  static Scanner sc= new Scanner(System.in);
  
  static void nhapMang( int []a, int n){
      for ( int i=0;i<n;i++){
          System.out.printf("arr[%d]=",i);
          a[i]=sc.nextInt();
      }
  }
  static void xuatMang(int[]a, int n){
            for ( int i=0;i<n;i++){
          System.out.printf("arr[%d]=%d,",i,a[i]);
          
      }
      System.out.print("\b\b\n");
  }
   static boolean checkPrime(int n){
      if (n<2)
          return false;
      else if (n==2)
          return true;
      else if(n%2==0)
          return false;
      else
          for( int i=3;i<=(int )Math.sqrt(n); i++){
              if(n%i==0)
                  return false;
          }
      return true;
          
  }
  static int tinhTong(int[]a, int n){
      int sum=0;
      for( int i=0; i<n; i++){
          if (bt4.checkPrime(a[i]))
              sum+= a[i];
      }
      return sum;
  }
  static int timKiem ( int a[], int n, int x){
      int i=0;
      while ( i<n&& a[i]!=x){
          i++;
      }
      if(i==n)
          return -1;
          else 
          return i;
      
  }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr =new int[100];
        System.out.println("Hay nhap n:");
        int n= sc. nextInt();
        nhapMang(arr,n);
                xuatMang(arr,n);
          System.out.printf("Tong cac so nguyen to la &d.\n", tinhTong(arr,n));      
        
        System.out.printf("Hay nhap so can tim:");
        int x= sc.nextInt();
        int kq= timKiem(arr,n,x);
        if(kq!=-1)
            System.out.printf("Tim thay so %d tai vi tri %d.\n",x,kq);
        else
            System.out.printf("Khong tim thay so %d.\n",x);
    
    }
}
