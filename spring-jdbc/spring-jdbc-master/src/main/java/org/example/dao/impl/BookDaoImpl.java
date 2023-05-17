package org.example.dao.impl;

import org.example.dao.BookDao;
import org.example.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/17--@11:15
 */
@Repository
public class BookDaoImpl implements BookDao {
    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Integer addBook(Book book) {
        String sql = "insert into t_book(`name`)values(?)";
        Object[] param = {book.getName()};
        int result = jdbcTemplate.update(sql, param);
        return result;
    }
}
