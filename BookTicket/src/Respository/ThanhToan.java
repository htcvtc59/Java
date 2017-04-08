/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import App.Ve;
import ModelView.HoaDon;
import Views.BangThanhToan;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ThanhToan {
    public ArrayList<HoaDon> process(ArrayList<Ve> list)
    {  String[] KhungGio = new String[]{"", "7h45-9h15", "9h30-11h", "14h-15h30", "19h30-21h30"};
    String[] Loai = {"Thường", "Vip"};
     
        ArrayList<HoaDon> data=new ArrayList<HoaDon>();
        boolean check=false;
        for(Ve item:list)
        {
            
           for(HoaDon itemHd:data)
           {
               if(item.getPhim().equals(itemHd.getPhim()) && (KhungGio[item.getGioPhat()]+"   "+item.getDate()).equals(itemHd.getSuat()) && Loai[item.getLoai()].equals(itemHd.getLoai()))
               {
                   int sl=itemHd.getSl()+1;
                   itemHd.setSl(sl);
                   check=true;
                   break;
               } 
              
           }
           if(check==false)
           { HoaDon s=new HoaDon(item.getPhim(),KhungGio[item.getGioPhat()]+"   "+item.getDate(),Loai[item.getLoai()],1,item.getGia());
              data.add(s);
           }
           }
        for(HoaDon item:data)
        {
            item.setThanhtien(item.getDongia()*item.getSl());
        }
        return data;
    }
}
         
            
            
         

