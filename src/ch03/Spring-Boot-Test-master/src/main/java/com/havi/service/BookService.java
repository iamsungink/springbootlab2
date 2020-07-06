package com.havi.service;

import com.havi.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KimYJ on 2017-08-21.
 */
public interface BookService {
    List<Book> getBookList();
}
