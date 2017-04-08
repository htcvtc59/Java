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
public class tblBondReader {
    private int Id;
    private String ReaderId;
    private String DocumentId;
    private int Quantity;
    private String DateStart;
    private String DateFinish;

    public tblBondReader() {
    }
    public tblBondReader(int Id, String ReaderId, String DocumentId, int Quantity, String DateStart, String DateFinish) {
        this.Id = Id;
        this.ReaderId = ReaderId;
        this.DocumentId = DocumentId;
        this.Quantity = Quantity;
        this.DateStart = DateStart;
        this.DateFinish = DateFinish;
     
       
    }


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getReaderId() {
        return ReaderId;
    }

    public void setReaderId(String ReaderId) {
        this.ReaderId = ReaderId;
    }

    public String getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDateStart() {
        return DateStart;
    }

    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }

    public String getDateFinish() {
        return DateFinish;
    }

    public void setDateFinish(String DateFinish) {
        this.DateFinish = DateFinish;
    }



 


    
    
   
    
}
