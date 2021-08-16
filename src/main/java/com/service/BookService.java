package com.service;

import com.pojo.Books;

import java.util.List;

public interface BookService {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBook(int id);

    //更新Book
    int updateBook(Books book);

    //根据id查询，返回一个Book
    Books queryBookById(int id);

    //查询全部的Book,返回list集合
    List<Books> queryAllBook();

    //根据名称查询，返回一个Book
    Books queryBookByName(String bookName);
}
