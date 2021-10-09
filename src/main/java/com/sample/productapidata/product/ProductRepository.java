package com.sample.productapidata.product;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, String> {

    public List<Product> findByProductOrderId(String orderId);
}
