
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> bookSetName = new TreeSet<>();

        bookSetName.add(new Book("War and Peace", 1225, "Tolstoy", 1867));
        bookSetName.add(new Book("Crime and Punishment", 576, "Dostoevsky", 1866));
        bookSetName.add(new Book("Utopia", 359, "Thomas More", 1516));
        bookSetName.add(new Book("Alice in WonderLand", 208, "Lewis Carroll",1865));
        bookSetName.add(new Book("The Brothers Karamazov", 840, "Dostoevsky",1879));

        for (Book book:bookSetName) {
            System.out.println("Book Name: " +  book.getName() + " Page: " + book.getPageNum());
        }

        System.out.println("*******************************************");

        TreeSet<Book> bookSetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageNum() - b2.getPageNum();
            }
        }.reversed());

        bookSetPageNum.add(new Book("War and Peace", 1225, "Tolstoy", 1867));
        bookSetPageNum.add(new Book("Crime and Punishment", 576, "Dostoevsky", 1866));
        bookSetPageNum.add(new Book("Utopia", 359, "Thomas More", 1516));
        bookSetPageNum.add(new Book("Alice in WonderLand", 208, "Lewis Carroll",1865));
        bookSetPageNum.add(new Book("The Brothers Karamazov", 840, "Dostoevsky",1879));

        for (Book book:bookSetPageNum) {
            System.out.println("Book Name: " +  book.getName() + " Page: " + book.getPageNum());
        }

    }
}
