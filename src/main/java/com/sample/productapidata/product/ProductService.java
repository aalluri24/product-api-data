package com.sample.productapidata.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {
/*
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/addItem")
    public void addItem(@RequestBody Product product) {
        //items.put(item.getId(), item);
        productRepository.save(product);
    }

    @GetMapping("/getItemById/{id}")
    public Optional<Product> getItemById(@PathVariable String id) {
        //return items.get(id);
        return productRepository.findById(id);
    }

    @GetMapping("/getAllItems")
    public List<Product> getAllItems() {
        //return new ArrayList<Item>(items.values());
        List<Product> products = new ArrayList<>();
        productRepository.findAll()
                .forEach(products::add);

        return products;
    }

    @PutMapping("/updateItem/{id}")
    public void updateItem(@PathVariable String id, @RequestBody Product product) {
        productRepository.save(product);
    }

    @DeleteMapping("/deleteItem/{id}")
    public void deleteItem(@PathVariable String id) {
        productRepository.deleteById(id);
    } */



}
