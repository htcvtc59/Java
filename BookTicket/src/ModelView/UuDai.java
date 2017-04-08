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
public class UuDai {
    private String dt;
    private int sl;
    private double tongTien;

    public UuDai(String dt, int sl, double tongTien) {
        this.dt = dt;
        this.sl = sl;
        this.tongTien = tongTien;
    }

    public String getDt() {
        return dt;
    }

    public int getSl() {
        return sl;
    }

    public double getTongTien() {
        return tongTien;
    }
    
    
}
