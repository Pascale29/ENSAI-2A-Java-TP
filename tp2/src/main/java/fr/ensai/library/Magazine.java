package fr.ensai.library;

public class Magazine extends Item{

    // Attributes
    private String issn;
    private String issueNumber;
    
    /**
     * Constructs a new Magazine object.
     */
    public Magazine(String title, int year, int pageCount, String issn, String issueNumber) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber ;
    }

    // Getter for issn
    public String getIssn() {
        return issn;
    }

    // Setter for issn
    public void setIssn(String issn) {
        this.issn = issn;
    }

    // Getter for issueNumber
    public String getIssueNumber() {
        return issueNumber;
    }

    // Setter for issueNumber
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
}
