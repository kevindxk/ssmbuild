package com.kevin.dao;

import com.kevin.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @project_name：ssmbuild
 * @name：BookMap
 * @date：2021/4/3 1:31 下午
 * @auther：dexukong
 */
public interface BookMapper {

    // add
    int addBook(Books book);

    // detale
    int deleteBookById(@Param("bookID") int id);

    //update
    int updateBook(Books books);

    //select
    Books queryBookById(@Param("bookID") int id);

    //查询全部
    List<Books> queryAllBooks();


}
