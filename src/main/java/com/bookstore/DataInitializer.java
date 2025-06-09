package com.bookstore.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;

import jakarta.annotation.PostConstruct;

@Component("dataInitializerConfig") // <- nome de bean único
public class DataInitializer {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void init() {
        bookRepository.deleteAll();

        List<Book> initialBooks = List.of(
            createBook("Dom Casmurro", "Machado de Assis", 1899),
            createBook("1984", "George Orwell", 1949),
            createBook("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943)
        );

        bookRepository.saveAll(initialBooks);

        System.out.println("Livros iniciais inseridos no banco.");
    }

    private Book createBook(String title, String author, int year) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setYear(year);
        return book;
    }
}
