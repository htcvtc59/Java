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
public class DonGia {
    private String date;
    private double thuong,vip;
  private int suat;

    public DonGia(String date, int suat, double thuong, double vip) {
        this.date = date;
        this.thuong = thuong;
        this.vip = vip;
        this.suat = suat;
    }

    public String getDate() {
        return date;
    }

    public double getThuong() {
        return thuong;
    }

    public double getVip() {
        return vip;
    }

    public int getSuat() {
        return suat;
    }
    
    
}
