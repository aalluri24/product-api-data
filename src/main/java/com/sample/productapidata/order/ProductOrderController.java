package com.sample.productapidata.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productOrders")
public class ProductOrderController {

    //ConcurrentHashMap<String, Order> productOrders = new ConcurrentHashMap<>();
    @Autowired
    private ProductOrderRepository productOrderRepository;

    @PostMapping("/order")
    public void addOrder(@RequestBody ProductOrder productOrder) {
        //productOrders.put(order.getId(), order);
        productOrderRepository.save(productOrder);
    }

    @GetMapping
    public List<ProductOrder> getAllOrders() {
        //return new ArrayList<Order>(productOrders.values());
        List<ProductOrder> productOrders = new ArrayList<>();
        productOrderRepository.findAll()
                .forEach(productOrders::add);

        return productOrders;
    }

    @PutMapping("/order/{id}")
    public void updateItem(@PathVariable String id, @RequestBody ProductOrder productOrder) {
        productOrderRepository.save(productOrder);
    }

    @DeleteMapping("/order/{id}")
    public void deleteItem(@PathVariable String id) {
        productOrderRepository.deleteById(id);
    }
}
