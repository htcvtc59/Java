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
public class tblDocument {

    private String DocumentId;
    private String DocumentName;
    private String Description;
    private String CategoryId;
    private String PublisherId;
    private int Quantity;
    private String Price;
    private String YearDocument;
    private int Edition;
    private String Author;

    public tblDocument() {
    }

    public tblDocument(String DocumentId, String DocumentName, String Description, String CategoryId, String PublisherId, int Quantity, String Price, String YearDocument, int Edition, String Author) {
        this.DocumentId = DocumentId;
        this.DocumentName = DocumentName;
        this.Description = Description;
        this.CategoryId = CategoryId;
        this.PublisherId = PublisherId;
        this.Quantity = Quantity;
        this.Price = Price;
        this.YearDocument = YearDocument;
        this.Edition = Edition;
        this.Author = Author;
    }

    public String getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    public String getDocumentName() {
        return DocumentName;
    }

    public void setDocumentName(String DocumentName) {
        this.DocumentName = DocumentName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    public String getPublisherId() {
        return PublisherId;
    }

    public void setPublisherId(String PublisherId) {
        this.PublisherId = PublisherId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getYearDocument() {
        return YearDocument;
    }

    public void setYearDocument(String YearDocument) {
        this.YearDocument = YearDocument;
    }

    public int getEdition() {
        return Edition;
    }

    public void setEdition(int Edition) {
        this.Edition = Edition;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

}
