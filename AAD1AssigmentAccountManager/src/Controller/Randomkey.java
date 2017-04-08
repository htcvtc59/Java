package Controller;


import java.util.Random;

public class Randomkey {
public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIghijklJKLMNO345678PQRSTUVWXYZ1rstuvw290abcdefmnopqxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
      
}
