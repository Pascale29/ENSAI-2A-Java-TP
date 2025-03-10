package fr.ensai.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Represents a Library.
 */
public class Library {

    // Attributes
    private String name;
    private List<Book> books;


    /**
     * Constructs a new Library object.
     */
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    
    // Method
    /**
     * Add a new book to the library.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    // Method
    /**
     * display the books of the library.
     */
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Aucun livre dans la bibliothèque.");
        } else {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }

    /**
     * Loads books from a CSV file and adds them to the library.
     * 
     * @param filePath The path to the CSV file containing book data.
     * @throws IOException If there is an error reading the file, an
     *                     {@link IOException} will be thrown.
     */
    public void loadBooksFromCSV(String filePath) {

        URL url = getClass().getClassLoader().getResource(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            Map<String, Author> authors = new HashMap<>();
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String isbn = data[0].trim();
                    String title = data[1].trim();
                    String authorName = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    int pageCount = Integer.parseInt(data[4].trim());

                    // Check if author already exists in the map
                    Author author = authors.get(authorName);
                    if (author == null) {
                        author = new Author(authorName,0, " ");
                        authors.put(authorName, author);
                        System.out.println(author.toString());
                    }
                    Book book = new Book(title, year, pageCount, isbn, author);

                    this.addBook(book);
                }
            }
        } catch (

        IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

}
