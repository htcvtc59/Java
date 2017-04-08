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
public class DoanhThu {
    private int gioPhat,slVip,slThuong,slVe;
    private double tongGiaVip,tongGiaThuong,tongGia;

    public void setSlVe(int slVe) {
        this.slVe = slVe;
    }

    public int getSlVe() {
        return slVe;
    }

    public DoanhThu(int gioPhat, int slVip, int slThuong, double tongGiaVip, double tongGiaThuong) {
        this.gioPhat = gioPhat;
        this.slVip = slVip;
        this.slThuong = slThuong;
        this.tongGiaVip = tongGiaVip;
        this.tongGiaThuong = tongGiaThuong;
        this.tongGia = this.tongGiaVip+this.tongGiaThuong;
        this.slVe=this.slVip+this.slThuong;
    }

    public int getGioPhat() {
        return gioPhat;
    }

    public int getSlVip() {
        return slVip;
    }

    public int getSlThuong() {
        return slThuong;
    }

    public double getTongGiaVip() {
        return tongGiaVip;
    }

    public double getTongGiaThuong() {
        return tongGiaThuong;
    }

    public double getTongGia() {
        return tongGia;
    }

    public void setGioPhat(int gioPhat) {
        this.gioPhat = gioPhat;
    }

    public void setSlVip(int slVip) {
        this.slVip = slVip;
    }

    public void setSlThuong(int slThuong) {
        this.slThuong = slThuong;
    }

    public void setTongGiaVip(double tongGiaVip) {
        this.tongGiaVip = tongGiaVip;
    }

    public void setTongGiaThuong(double tongGiaThuong) {
        this.tongGiaThuong = tongGiaThuong;
    }

    public void setTongGia(double tongGia) {
        this.tongGia = tongGia;
    }
    
    
}
