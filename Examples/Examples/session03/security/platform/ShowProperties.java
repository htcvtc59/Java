/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.security.platform;

import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author ChuTuanLuyen
 */
public class ShowProperties {
    public static void main(String[] args) {
        Properties prop = System.getProperties();
        Enumeration<Object> keys = prop.keys();
        while(keys.hasMoreElements()){
            String key = (String) keys.nextElement();
            System.out.println("KEY: " + key+": " + System.getProperty(key));
        }
    }
}
