package com.ra.controller;

import com.ra.model.Category;
import com.ra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public ResponseEntity<?> home(){
        return new ResponseEntity<>("Home", HttpStatus.OK);
    }
    @GetMapping("/category")
    public ResponseEntity<List<Category>> category(){
        List<Category> categories = categoryService.getAll();
        return new ResponseEntity<>(categories,HttpStatus.OK);
    }
}
