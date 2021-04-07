package com.kevin.service;

import com.kevin.dao.BookMapper;
import com.kevin.pojo.Books;

import java.util.List;

/**
 * @project_name：ssmbuild
 * @name：BookServiceImpl
 * @date：2021/4/3 2:04 下午
 * @auther：dexukong
 */
public class BookServiceImpl implements BookService{

    //业务层调dao层

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
