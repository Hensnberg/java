package com.dao;

import com.pojo.Books;
import com.service.BookService;
import com.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService=(BookService) applicationContext.getBean("BookServiceImpl",BookService.class);
//        Books book=bookService.queryBookById(1);
//        System.out.println(book.getBookName());
    }
}
