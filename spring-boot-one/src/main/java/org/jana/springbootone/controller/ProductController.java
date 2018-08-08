package org.jana.springbootone.controller;

import org.jana.springbootone.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity index() {
        System.out.println("ProductController index");
        return new ResponseEntity("ProductController index", HttpStatus.OK);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity getProduct() {
        System.out.println("Get product");
        return new ResponseEntity("Here are the products", HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity saveProduct(@RequestBody Product product) {
        System.out.println("Save product - " + product);
        //cal service
        return new ResponseEntity("Product saved successfully", HttpStatus.OK);
    }

}
