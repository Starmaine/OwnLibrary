package com.librarysring.library.Service;

import com.librarysring.library.Entity.Book;
import com.librarysring.library.Repository.BookRep;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRep bookRep;

    public BookServiceImpl(BookRep bookRep) {
        this.bookRep = bookRep;
    }

    @Override
    public void saveBook(Book book) {
        bookRep.save(book);
    }

    @Override
    public String updateBook(Long id, Book book) {
        if(bookRep.existsById(id)) {
            book.setId(id);
            bookRep.save(book);
            return "Book was successfully updated!";
        }
        return "Book not found!";
    }

    @Override
    public void deleteBook(Long id) {
        bookRep.deleteById(id);
    }

    @Override
    public Book findBookByTitle(String title) {
        return bookRep.findByTitle(title);
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRep.findById(id);
    }
}
