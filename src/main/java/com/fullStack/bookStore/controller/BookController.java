package com.fullStack.bookStore.controller;

import com.fullStack.bookStore.dto.BookDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //-> register controller as rest controller to spring container
@RequestMapping("api/v1/books")
public class BookController {

    //-> return list of books
    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto firstBook = BookDto.builder()
                .title("First Book Title")
                .build(); // -> use constructor and return object
        BookDto secondBook = BookDto.builder()
                .title("Second Book Title")
                .build();

        List<BookDto> books = new ArrayList<>();
        books.add(firstBook);
        books.add(secondBook);
        return ResponseEntity.ok(books);
    }
}
