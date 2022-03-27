package BookList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Book1", 231, "Author1", LocalDate.of(1999, 1,1)));
        bookList.add(new Book("Book2", 232, "Author2", LocalDate.of(1999, 1,2)));
        bookList.add(new Book("Book3", 233, "Author3", LocalDate.of(1999, 1,3)));
        bookList.add(new Book("Book4", 234, "Author4", LocalDate.of(1999, 1,4)));
        bookList.add(new Book("Book5", 235, "Author5", LocalDate.of(1999, 1,5)));
        bookList.add(new Book("Book6", 236, "Author6", LocalDate.of(1999, 1,6)));
        bookList.add(new Book("Book7", 237, "Author7", LocalDate.of(1999, 1,7)));
        bookList.add(new Book("Book8", 238, "Author8", LocalDate.of(1999, 1,8)));
        bookList.add(new Book("Book9", 239, "Author9", LocalDate.of(1999, 1,9)));
        bookList.add(new Book("Book10", 240, "Author10", LocalDate.of(1999, 1,10)));

        Map<String, String> bookMap = bookList.stream().collect(Collectors.toMap(Book::getName, Book::getAuthorsName));
        List<Book> ListOfBooks = bookList.stream().filter(s -> s.getNumberOfPage() > 100).collect(Collectors.toList());
    }
}
