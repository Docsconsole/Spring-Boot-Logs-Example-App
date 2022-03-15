package com.docsconsole.tutorials.controllers;

import com.docsconsole.tutorials.service.ProductServiceLog4jImpl;
import com.docsconsole.tutorials.service.ProductServicelogBackImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curd-app/api/log4J")
public class ProductsControllerLog4j {
    private static final Logger logger = LogManager.getLogger(ProductsControllerLog4j.class);

    @Autowired
    ProductServiceLog4jImpl productServiceImpl;

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
