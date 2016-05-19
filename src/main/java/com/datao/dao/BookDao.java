package com.datao.dao;

import com.datao.pojo.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by 海涛 on 2016/5/17.
 */
@Named
public class BookDao extends BaseDao<Book,String>{


}
