/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MacOS
 */
public class DateToDTime {

    public static String SDateDateTime(String dateinString) {
        String datetime = "";
        SimpleDateFormat stoDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat DtoDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = stoDate.parse(dateinString);
            datetime = DtoDateTime.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return datetime;
    }

    public static Date SToDate(String dateinString) {
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dateinString);
        } catch (Exception ex) {
            ex.getMessage();
        }

        return date;
    }

    public static String Datechooser(JDateChooser dateChooser) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return sdf.format(dateChooser.getDate());

    }

}
