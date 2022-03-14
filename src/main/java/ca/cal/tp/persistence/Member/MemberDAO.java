package ca.cal.tp.persistence.Member;

import ca.cal.tp.model.Document.Abstract.Document;
import ca.cal.tp.model.Document.Book;

import java.util.List;

public interface MemberDAO {
    <T> void save(T t);
    <T> void merge(T t);
    Document getDocument(int id);
    List<Book> getBooksByTitle(String title);
    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByYear(int year);
    List<Book> getBooksByGenre(String genre);

}
