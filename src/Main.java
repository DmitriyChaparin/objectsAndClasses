public class Main {


    public static void main(String[] args) {
        Author author = new Author("Никита", "Жуков");
        Book book = new Book("Модицина", 2020, author);
        System.out.println(book.getBookName() + book.getPublicationYear() + author.getName() + author.getLastName());
        Author author1 = new Author("Фёдор", "Катасонов");
        Book book1 = new Book("Федиатрия", 2021, author1);
        System.out.println(book1.getBookName() + book1.getPublicationYear() + author1.getName() + author1.getLastName());
        book1.setPublicationYear(2022);
        System.out.println("book1.getPublicationYear() = " + book1.getPublicationYear());
        Author author2 = new Author(" Vladimir", " Nabokov");
        Book book2 = new Book("Lolita", 1955, author2);
        System.out.println(book2.getBookName() + book2.getPublicationYear() + author2.getName() + author2.getLastName());


    }
}

