public class Book {
    private String bookName;
    private int publicationYear;
   Author author;

    public Book(String bookName, int publicationYear , Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;

    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }





}

