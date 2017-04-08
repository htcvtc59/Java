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
public class tblPayReader {
    
    private int Id;
    private String DocumentId;
    private String ReaderId;
    private int QuantityPay;
    private String DatePay;
    private String MoneyBorrow;
    private String MoneyReturn;
    private String MoneyLost;

    public tblPayReader() {
    }

    public tblPayReader(int Id, String DocumentId, String ReaderId, int QuantityPay, String DatePay, String MoneyBorrow, String MoneyReturn, String MoneyLost) {
        this.Id = Id;
        this.DocumentId = DocumentId;
        this.ReaderId = ReaderId;
        this.QuantityPay = QuantityPay;
        this.DatePay = DatePay;
        this.MoneyBorrow = MoneyBorrow;
        this.MoneyReturn = MoneyReturn;
        this.MoneyLost = MoneyLost;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    public String getReaderId() {
        return ReaderId;
    }

    public void setReaderId(String ReaderId) {
        this.ReaderId = ReaderId;
    }

    public int getQuantityPay() {
        return QuantityPay;
    }

    public void setQuantityPay(int QuantityPay) {
        this.QuantityPay = QuantityPay;
    }

    public String getDatePay() {
        return DatePay;
    }

    public void setDatePay(String DatePay) {
        this.DatePay = DatePay;
    }

    public String getMoneyBorrow() {
        return MoneyBorrow;
    }

    public void setMoneyBorrow(String MoneyBorrow) {
        this.MoneyBorrow = MoneyBorrow;
    }

    public String getMoneyReturn() {
        return MoneyReturn;
    }

    public void setMoneyReturn(String MoneyReturn) {
        this.MoneyReturn = MoneyReturn;
    }

    public String getMoneyLost() {
        return MoneyLost;
    }

    public void setMoneyLost(String MoneyLost) {
        this.MoneyLost = MoneyLost;
    }
    
    
    
}
