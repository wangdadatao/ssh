package com.datao.action;

import com.datao.pojo.Book;
import com.datao.service.BookService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 海涛 on 2016/5/17.
 * 书籍Action
 */
public class BookAction {

    @Inject
    private BookService bookService;

    private List<Book> books;

    @Action("index")
    public String index() {
        return "success";
    }

    @Action(value = "")
    public String home() {
        books = bookService.findAll();
        return "success";
    }


    //get set
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
