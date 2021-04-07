package com.kevin.service;

import com.kevin.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @project_name：ssmbuild
 * @name：BookService
 * @date：2021/4/3 2:00 下午
 * @auther：dexukong
 */
public interface BookService {

    // add
    int addBook(Books book);

    // detale
    int deleteBookById(int id);

    //update
    int updateBook(Books books);

    //select
    Books queryBookById(int id);

    //查询全部
    List<Books> queryAllBooks();

}
