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
public class HotPhim {

    String name;
    int slVe, slChieu;
    float tile;

    public HotPhim(String name, int slVe) {
        this.name = name;
        this.slVe = slVe;
    
      
    }

    public String getName() {
        return name;
    }

    public int getSlVe() {
        return slVe;
    }

    public int getSlChieu() {
        return slChieu;
    }

    public float getTile() {
        return tile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlVe(int slVe) {
        this.slVe = slVe;
    }

    public void setSlChieu(int slChieu) {
        this.slChieu = slChieu;
    }

    public void setTile(float tile) {
        this.tile = tile;
    }
    
    

}
