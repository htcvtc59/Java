package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInFormat {

    public static boolean isValidFormat(String value) {
        Date date = new Date();
        boolean status = false;
        if (value.length() != 0) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                date = sdf.parse(value);
                if (!value.equals(sdf.format(date))) {
                    status = false;
                } else {
                    status = true;
                     date = sdf.parse(value);
                }
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

        }
        return status;
    }
}
