/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author DELL
 */
public class LichChieu {
   private String phim,phong,ngay;
   private int gioPhat;

    public LichChieu(String phim, String phong,  int gioPhat,String ngay) {
        this.phim = phim;
        this.phong = phong;
        this.ngay = ngay;
        this.gioPhat = gioPhat;
    }

    public String getPhim() {
        return phim;
    }

    public String getPhong() {
        return phong;
    }

    public String getNgay() {
        return ngay;
    }

    public int getGioPhat() {
        return gioPhat;
    }
   
   
    
}
