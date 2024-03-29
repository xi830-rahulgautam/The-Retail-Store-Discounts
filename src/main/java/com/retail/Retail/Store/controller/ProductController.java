package com.retail.Retail.Store.controller;

import com.retail.Retail.Store.entity.Product;
import com.retail.Retail.Store.entity.Store;
import com.retail.Retail.Store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/addProduct")
    public Product addProduct(@RequestBody Product product)
    {

        return productService.addProduct(product);
    }

    @RequestMapping(value = "/getAllProduct")
    public List<Product> getAllProduct()
    {
        return productService.getAllProduct();
    }

    @RequestMapping(value = "/addStore")
    public Store addNewStore(@RequestBody Store store)
    {
        return productService.addStore(store);
    }

    }
