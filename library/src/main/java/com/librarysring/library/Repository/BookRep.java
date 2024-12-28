package com.librarysring.library.Repository;

import com.librarysring.library.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRep extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
}
