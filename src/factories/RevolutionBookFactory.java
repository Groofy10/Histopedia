package factories;

import models.*;

public class RevolutionBookFactory extends BookFactory
{

    // Methods

    /**
     * Creates a new RevolutionBook instance.
     *
     * @param id The unique identifier for the book.
     * @param title The title of the book.
     * @param genre The genre of the book.
     * @param description A brief description of the book.
     * @param author The author of the book.
     * @param publisher The publisher of the book.
     * @param publicationYear The year the book was published.
     * @param isbn The International Standard Book Number of the book.
     * @param status The current status of the book (e.g., Available, Borrowed, Unavailable).
     * @return A new RevolutionBook instance.
     */
    @Override
    public Book createBook(String id, String title, String genre, String description, String author, String publisher, int publicationYear, String isbn, String status)
    {
        return new RevolutionBook(id, title, genre, description, author, publisher, publicationYear, isbn, status);
    }

}