package com.sample.productapidata.order;

import org.springframework.data.repository.CrudRepository;

public interface ProductOrderRepository extends CrudRepository<ProductOrder, String> {
}
