package com.librarysring.library.Service;

import com.librarysring.library.Entity.Book;

import java.util.Optional;

public interface BookService {
    void saveBook(Book book);

    String updateBook(Long id, Book book);

    void deleteBook(Long id);

    Book findBookByTitle(String title);

    Optional<Book> getBookById(Long id);
}
