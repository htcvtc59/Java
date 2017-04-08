/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

/**
 *
 * @author DELL
 */
public class HoaDon {
    private String phim,suat,loai;
    private int sl;
    private double dongia,thanhtien;

    public HoaDon(String phim, String suat, String loai, int sl, double dongia) {
        this.phim = phim;
        this.suat = suat;
        this.loai = loai;
        this.sl = sl;
        this.dongia = dongia;
        this.thanhtien = sl*dongia;
    }

    public String getPhim() {
        return phim;
    }

    public void setPhim(String phim) {
        this.phim = phim;
    }

    public String getSuat() {
        return suat;
    }

    public void setSuat(String suat) {
        this.suat = suat;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    
}
