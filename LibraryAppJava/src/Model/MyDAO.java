/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VuongNguyenVan
 */
public interface MyDAO<T> {
    
    
    T Insert (T t);
    T Update (T t);
    T Delete (T t);
    ArrayList<T> GetAll();
    List<T> Search (ArrayList<T> list,String s);
}
