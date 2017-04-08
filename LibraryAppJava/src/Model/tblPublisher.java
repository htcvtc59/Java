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
public class tblPublisher {
    private String PublisherId;
    private String PublisherName;
    private String Address;
    private String Phone;
    private String Email;

    public tblPublisher() {
    }

    public tblPublisher(String PublisherId, String PublisherName, String Address, String Phone, String Email) {
        this.PublisherId = PublisherId;
        this.PublisherName = PublisherName;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getPublisherId() {
        return PublisherId;
    }

    public void setPublisherId(String PublisherId) {
        this.PublisherId = PublisherId;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String PublisherName) {
        this.PublisherName = PublisherName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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
    
    
}
