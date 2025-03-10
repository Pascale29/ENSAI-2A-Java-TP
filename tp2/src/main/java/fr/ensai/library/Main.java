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
    }
}