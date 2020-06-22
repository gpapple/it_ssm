package com.it.ssm.service;

import com.it.ssm.domain.Product;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/21 - 15:26
 */
public interface ProductService {

    List<Product> findProductAll();

    void save(Product product);
}
