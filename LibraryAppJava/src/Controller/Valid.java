/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Pattern;

/**
 *
 * @author MacOS
 */
public class Valid {

    /*   public boolean ValidN(String s){
    Pattern pattern = Pattern.compile(".*[^0-9].*");
    
    return !pattern.matcher(s).matches();
    
    }*/
    public static boolean ValidN(String str) {
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static String VToUpper(String str) {
        str = str.toUpperCase();
        return str;
    }

    public static boolean ValidYear(String str) {
        if (ValidN(str)) {
            if (str.length() <= 4 && str.length() > 3) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean ValidPhone(String str) {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) 
        {
            return false;
        } 
        else if (str.length() == 10 || str.length() == 11)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public static boolean ValidEmail(String email) {
        boolean status = false;
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;

    }
}
