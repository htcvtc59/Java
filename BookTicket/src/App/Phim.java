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
public class Phim {
    private String phim,theloai,quocgia,nsx,mota;

    public Phim(String phim, String theloai, String quocgia, String nsx, String mota) {
        this.phim = phim;
        this.theloai = theloai;
        this.quocgia = quocgia;
        this.nsx = nsx;
        this.mota = mota;
    }

    public void setPhim(String phim) {
        this.phim = phim;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getPhim() {
        return phim;
    }

    public String getTheloai() {
        return theloai;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public String getNsx() {
        return nsx;
    }

    public String getMota() {
        return mota;
    }
    
    
}
