package com.it.ssm.dao;

import com.it.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/21 - 15:17
 */
public interface ProductDao {

    @Select("select * from product")
    List<Product> findProductAll();
}
