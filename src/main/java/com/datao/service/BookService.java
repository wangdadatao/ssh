package com.datao.service;

import com.datao.dao.BookDao;
import com.datao.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by 海涛 on 2016/5/17.
 */
@Named
@Transactional
public class BookService {

    @Inject
    private BookDao bookDao;


    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
