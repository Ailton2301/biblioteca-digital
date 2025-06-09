package com.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bookstore.entity.Book;
import com.bookstore.service.BookService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CommandLineRunner demo(BookService bookService) {
        return args -> {
            // Teste inicial de persistência
            Book book1 = new Book("Dom Casmurro", "Machado de Assis", 1899);
            Book book2 = new Book("1984", "George Orwell", 1949);
            
            bookService.saveBook(book1);
            bookService.saveBook(book2);
            
            System.out.println("Livros cadastrados:");
            bookService.getAllBooks().forEach(System.out::println);
        };
    }
}