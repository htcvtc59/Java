/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author VuongNguyenVan
 */
public class tblReader {
    private String ReaderId;
    private String ReaderName;
    private String Birday;
    private String Phone;
    private String Email;
    private String Address;

    public tblReader() {
    }

    public tblReader(String ReaderId, String ReaderName, String Birday, String Phone, String Email, String Address) {
        this.ReaderId = ReaderId;
        this.ReaderName = ReaderName;
        this.Birday = Birday;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
    }

    public String getReaderId() {
        return ReaderId;
    }

    public void setReaderId(String ReaderId) {
        this.ReaderId = ReaderId;
    }

    public String getReaderName() {
        return ReaderName;
    }

    public void setReaderName(String ReaderName) {
        this.ReaderName = ReaderName;
    }

    public String getBirday() {
        return Birday;
    }

    public void setBirday(String Birday) {
        this.Birday = Birday;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
}
