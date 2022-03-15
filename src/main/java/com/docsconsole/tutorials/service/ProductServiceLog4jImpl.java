package com.docsconsole.tutorials.service;

import com.docsconsole.tutorials.model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceLog4jImpl {

    private static final Logger logger = LogManager.getLogger(ProductServiceLog4jImpl.class);

    public ResponseEntity<?> getAllProducts() {
        List list = new ArrayList();
        Product product1 = new Product();
        product1.setProductId(1001l);
        product1.setProductName("testProduct");
        product1.setProductVendorName("testVendorName");

        Product product2 = new Product();
        product2.setProductId(1001l);
        product2.setProductName("testProduct");
        product2.setProductVendorName("testVendorName");
        list.add(product1);
        list.add(product2);

        logger.debug("Test debug message");
        return ResponseEntity.ok(list);
    }

}
