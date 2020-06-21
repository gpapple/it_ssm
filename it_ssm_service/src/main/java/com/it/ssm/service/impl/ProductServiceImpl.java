package com.it.ssm.service.impl;

import com.it.ssm.dao.ProductDao;
import com.it.ssm.domain.Product;
import com.it.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/21 - 15:29
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findProductAll() {
        return productDao.findProductAll();
    }
}
