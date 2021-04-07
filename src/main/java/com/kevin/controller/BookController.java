package com.kevin.controller;


import com.kevin.pojo.Books;
import com.kevin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @project_name：ssmbuild
 * @name：BookController
 * @date：2021/4/3 3:20 下午
 * @auther：dexukong
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allbook")
    public String list(Model model){

        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("books",books);
        return "allBook";
    }



}
