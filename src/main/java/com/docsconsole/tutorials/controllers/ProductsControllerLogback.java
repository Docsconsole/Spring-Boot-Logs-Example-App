package com.docsconsole.tutorials.controllers;

import com.docsconsole.tutorials.service.ProductServicelogBackImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curd-app/api/logback")
public class ProductsControllerLogback {
    Logger logger = LoggerFactory.getLogger(ProductsControllerLogback.class);

    @Autowired
    ProductServicelogBackImpl productServiceImpl;

    @GetMapping("/testWeb")
    public String testWeb() {
        logger.trace("A TRACE Message @testWeb");
        logger.debug("A DEBUG Message @testWeb");
        logger.info("An INFO Message @testWeb");
        logger.warn("A WARN Message @testWeb");
        logger.error("An ERROR Message @testWeb");
        return "Result: Success";
    }

    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts() {
        return productServiceImpl.getAllProducts();
    }

}
