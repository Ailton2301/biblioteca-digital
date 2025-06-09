package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Book;

public interface IBookStoreService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Long id);
}
