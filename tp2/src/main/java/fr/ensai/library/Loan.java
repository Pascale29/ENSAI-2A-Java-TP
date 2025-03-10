package fr.ensai.library;

import java.sql.Date;

public class Loan {

    // Attributes
    private Item item;
    private Student borrower;
    private Date startDate ;
    private Date returnDate ;

    /**
     * Constructs a new loan object.
     */
    public Loan(Item item, Student borrower, Date startDate, Date returnDate) {
        this.item = item;
        this.borrower = borrower ;
        this.startDate = startDate;
        this.returnDate = returnDate;
    }

    // Getter for item
    public Item getItem() {
        return item;
    }

    // Setter for item
    public void setItem(Item item) {
        this.item = item;
    }

    // Getter for borrower
    public Student getBorrower() {
        return borrower;
    }

    // Setter for borrower
    public void setBorrower(Student borrower) {
        this.borrower = borrower;
    }

    // Getter for startDate
    public Date getStartDate() {
        return startDate;
    }

    // Setter for startDate
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    // Getter for returnDate
    public Date getReturnDate() {
        return returnDate;
    }

    // Setter for returnDate
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
}
