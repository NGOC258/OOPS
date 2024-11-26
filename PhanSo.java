/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author HONG NGOC
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        if (mauSo==0)
            throw new IllegalArgumentException("Mau so khong duoc bang 0");
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
        this.tuSo=0;
        this.mauSo=1;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public static int ucln(int a, int b){
        if(b==0)
            return a;
        return ucln(b,a%b);
    }
    public PhanSo rutGon(){
    int u = ucln(tuSo, mauSo);
    int t= tuSo/u;
    int m= mauSo/u;
    PhanSo kq= new PhanSo(t,m);
    return kq;
}
    public PhanSo cong( PhanSo ps){
        int t= this.tuSo*ps.mauSo+ps.tuSo*this.mauSo;
        int m= this.mauSo* ps.mauSo;
        PhanSo kq= new PhanSo (t,m);
        return kq.rutGon();
    }
    public PhanSo tru( PhanSo ps){
        int t= this.tuSo*ps.mauSo-ps.tuSo*this.mauSo;
        int m= this.mauSo* ps.mauSo;
        PhanSo kq= new PhanSo (t,m);
        return kq.rutGon();
    }
    public PhanSo nhan( PhanSo ps){
        int t= this.tuSo*ps.tuSo;
        int m= this.mauSo* ps.mauSo;
        PhanSo kq= new PhanSo (t,m);
        return kq.rutGon();
    }
    public PhanSo chia( PhanSo ps){
        if (ps.tuSo==0)
            throw new IllegalArgumentException("Loi chia cho 0");
        int t= this.tuSo*ps.mauSo+ps.tuSo*this.mauSo;
        int m= this.mauSo* ps.mauSo;
        PhanSo kq= new PhanSo (t,m);
        return kq.rutGon();
    }
    // lon hon :1, nho hon: -1, bang:0
    public int soSanh(PhanSo ps){
        int left= this.tuSo*ps.mauSo;
        int right= ps.tuSo* this.mauSo;
        return Integer.compare(left, left);
    }
    
    
    @Override
    public String toString() {
        if (tuSo==0)
            return "0";
        if ( mauSo==1)
                return String.format("%d",tuSo);
        return String.format("%d/%d",tuSo,mauSo);
    }

    
}