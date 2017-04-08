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
public class HotDay {
    private String date;
    private int slVip,slThuong,tongVe;

    public HotDay(String date, int slVip, int slThuong) {
        this.date = date;
        this.slVip = slVip;
        this.slThuong = slThuong;
        this.tongVe=this.slThuong+this.slVip;
    }

    public String getDate() {
        return date;
    }

    public int getSlVip() {
        return slVip;
    }

    public int getSlThuong() {
        return slThuong;
    }

    public int getTongVe() {
        return tongVe;
    }
    
    
}
