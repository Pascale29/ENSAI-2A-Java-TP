package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
            "The Fellowship of the Ring",
            1954,
            423,
            "978-0-618-26025-6",
            tolkien);

        System.out.println(fellowshipOfTheRing.toString());

        Library ensai = new Library("ensai");  
        //ensai.loadBooksFromCSV("books.csv");
        //ensai.displayItems();

        Magazine vogue = new Magazine("vogue", 2020, 22, null, null);
        Magazine Vie = new Magazine("Vie", 2021, 220, null, null);

        ensai.addItem(Vie);
        ensai.addItem(vogue);

        ensai.displayItems();

    }

    
}