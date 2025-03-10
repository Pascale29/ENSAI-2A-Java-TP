package fr.ensai.library;

import java.util.Objects;

/**
 * Represents an item.
 */
public class Item {

    // Attributes
    protected String title;
    protected int year;
    protected int pageCount;


    /**
     * Constructs a new Item object.
     */
    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount ;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for year
     public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for pageCount
    public int getPageCount() {
        return pageCount;
    }

    // Setter for pageCount
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}
