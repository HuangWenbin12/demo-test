package com.example.demotest.service.impl;

import com.example.demotest.service.BookService;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("save is running...");
    }
}
