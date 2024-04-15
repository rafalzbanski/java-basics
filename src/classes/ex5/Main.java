package classes.ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Book Collection ---------");

        System.out.println("Actual collection: " + Book.getBookCollection());

        Book book1 = new Book("nie chcę być wieczny", "Andrzej Tucholski", "958627-6-2");
        Book book2 = new Book("Odkrywanie mechanicznych cudów", "Foryś Magdalena", "970577-3-9");
        Book book3 = new Book("Projekt Matura", "Marta Pinińska", "970243-0-4");
        Book book4 = new Book("Space Songs", "Agata Kołodziejczyk", "956752-4-9");
        Book book5 = new Book("Wegański Sylwester", "Edyta Muł-Pałka", "967471-4-3");

        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);
        Book.addBook(book4);
        Book.addBook(book5);

        System.out.println("--------- After update collection ---------");

        ArrayList< Book > bookCollection = Book.getBookCollection();
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println("\"" + book.getTitle() + "\"" + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }


        Book.removeBook(book2);

        System.out.println("--------- After remove book number 2 from collection ---------");

        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println("\"" + book.getTitle() + "\"" + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

    }
}
