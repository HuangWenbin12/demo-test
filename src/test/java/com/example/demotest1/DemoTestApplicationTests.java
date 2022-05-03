package com.example.demotest1;

import com.example.demotest.DemoTestApplication;
import com.example.demotest.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoTestApplication.class)
class DemoTestApplicationTests {

    @Autowired
    private BookService bookService;
    @Test
    void contextLoads() {
    }


    @Test
    public void save(){
        bookService.save();
        System.out.println("demo-test");
    }

    @Test
    public void update(){
        bookService.save();
        System.out.println("demo-test");
    }
}
