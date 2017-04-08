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
public class Ve {
    private String id,phim,phong,ghe,dt,date;
    private int gioPhat,trangthai,loai;
    private double gia;

    public Ve(String phim, String date, int gioPhat, int loai, double gia) {
        this.phim = phim;
        this.date = date;
        this.gioPhat = gioPhat;
        this.loai = loai;
        this.gia = gia;
    }
    

    public Ve(String id, String phim, int gioPhat,String date, String phong, String ghe, double gia,String dt, int trangthai) {
        this.id = id;
        this.phim = phim;
        this.phong = phong;
        this.ghe = ghe;
        this.dt = dt;
        this.gioPhat = gioPhat;
        this.trangthai = trangthai;
        this.gia = gia;
        this.date=date;
    }

    public String getId() {
        return id;
    }

    public String getPhim() {
        return phim;
    }

    public String getPhong() {
        return phong;
    }

    public String getGhe() {
        return ghe;
    }

    public String getDt() {
        return dt;
    }

    public int getGioPhat() {
        return gioPhat;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public double getGia() {
        return gia;
    }
    public String getDate()
    {
        return date;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }
    
             
}
