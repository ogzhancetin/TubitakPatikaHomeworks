package BookList;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String name;
    private int numberOfPage;
    private String authorsName;
    private LocalDate publishDate;

    public Book(String name, int numberOfPage, String authorsName, LocalDate publishDate) {
        this.name = name;
        this.numberOfPage = numberOfPage;
        this.authorsName = authorsName;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPage == book.numberOfPage
                && Objects.equals(name, book.name)
                && Objects.equals(authorsName, book.authorsName)
                && Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfPage, authorsName, publishDate);
    }
}
