package com.chengzi.Controller;


import com.chengzi.bean.Book;
import com.chengzi.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookMapper bookMapper;

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") Integer id){
        return bookMapper.getBookById(id);
    }

    @GetMapping("/book")
    public Book insertBook(Book book){
        bookMapper.insertBook(book);
        return book;
    }

}
