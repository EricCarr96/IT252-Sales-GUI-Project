/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesgui;

/**
 *
 * @author Administrator
 */
public class SalesRep {
    
    private int repID;
    private String firstName, lastName, district, contact;
    private double suppliesSold, booksSold, paperSold;
    
    public int getRepID() {
        return repID;
    }

    public void setRepID(int repID) {
        this.repID = repID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getSuppliesSold() {
        return suppliesSold;
    }

    public void setSuppliesSold(double suppliesSold) {
        this.suppliesSold = suppliesSold;
    }

    public double getBooksSold() {
        return booksSold;
    }

    public void setBooksSold(double booksSold) {
        this.booksSold = booksSold;
    }

    public double getPaperSold() {
        return paperSold;
    }

    public void setPaperSold(double paperSold) {
        this.paperSold = paperSold;
    }

    
    
    @Override
    public String toString() {
        return "SalesRep{" +  ", firstName= " + firstName + ", lastName= " +
                lastName + "repID= " + repID + ", booksSold= " + booksSold + ", suppliesSold= " +
                suppliesSold +  ", paperSold= " + paperSold + ", contact= " + contact + ", district="  + district +'}';
    }

     

    
 

  
   
}
