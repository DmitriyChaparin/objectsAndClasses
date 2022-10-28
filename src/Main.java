public class Main {


    public static void main(String[] args) {
        Author author = new Author("Никита", "Жуков");
        Book book = new Book("Модицина", 2020, author);
        System.out.println(book);
        Author author1 = new Author("Фёдор", "Катасонов");
        Book book1 = new Book("Федиатрия", 2021, author1);
        book1.setPublicationYear(2022);
        System.out.println(book1);
        Author author2 = new Author("Vladimir", "Nabokov");
        Book book2 = new Book("Lolita", 1955, author2);
        System.out.println(book2);
        Author author3 = new Author("Vladimir", "Nabokov");
        Book book3 = new Book("Lolita", 1955, author3);
        System.out.println(book2.equals(book3));
        System.out.println(author2.equals(author3));
        System.out.println(book1.equals(book));

    }
}

