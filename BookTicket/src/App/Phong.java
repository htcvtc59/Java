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
public class Phong {
    private String tenPhim;
    private int gioPhat,slVip,slThuong;

    public Phong(String tenPhim, int gioPhat, int slVip, int slThuong) {
       
        this.tenPhim = tenPhim;
        this.gioPhat = gioPhat;
        this.slVip = slVip;
        this.slThuong = slThuong;
      
        
                
    }

    public String getTenPhim() {
        return tenPhim;
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
    
}
