package com.sample.productapidata.product;

import com.sample.productapidata.order.ProductOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class ProductController {

    //private ConcurrentHashMap<String, Product> Products = new ConcurrentHashMap();

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/{orderId}/products")
    public void addProduct(@RequestBody Product product, @PathVariable String orderId) {
        //Products.put(Product.getId(), Product);
        product.setProductOrder(new ProductOrder(orderId, "", ""));
        productRepository.save(product);
    }

    @GetMapping("/{orderId}/products/{id}")
    public Optional<Product> getProductById(@PathVariable String orderId, @PathVariable String id) {
        //return Products.get(id);
        return productRepository.findById(id);
    }

    @GetMapping("/{orderId}/products")
    public List<Product> getAllProducts(@PathVariable String orderId) {
        //return new ArrayList<Product>(Products.values());
        List<Product> products = new ArrayList<>();
        productRepository.findByProductOrderId(orderId)
                .forEach(products::add);

        return products;
    }

    @PutMapping("/{orderId}/products/{id}")
    public void updateProduct(@PathVariable String orderId, @PathVariable String id, @RequestBody Product product) {
        product.setProductOrder(new ProductOrder(orderId, "", ""));
        productRepository.save(product);
    }

    @DeleteMapping("/{orderId}/products/{id}")
    public void deleteProduct(@PathVariable String orderId, @PathVariable String id) {
        productRepository.deleteById(id);
    }
}
