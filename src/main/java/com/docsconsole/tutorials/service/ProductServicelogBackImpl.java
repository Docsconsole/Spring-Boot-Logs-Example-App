package com.docsconsole.tutorials.service;

import com.docsconsole.tutorials.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServicelogBackImpl {

    Logger logger = LoggerFactory.getLogger(ProductServicelogBackImpl.class);

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
