package org.example.dao.impl;

import org.example.Main;
import org.example.dao.BookDao;
import org.example.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
@ContextConfiguration(classes = Main.class)
class BookDaoImplTest {
    @Autowired
    private BookDao dao;

    @Test
    public void test(){
        dao.addBook(new Book());
    }
}