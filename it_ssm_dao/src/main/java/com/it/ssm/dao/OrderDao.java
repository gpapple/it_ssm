package com.it.ssm.dao;

import com.it.ssm.domain.Orders;
import com.it.ssm.domain.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/22 - 21:15
 */
public interface OrderDao {

    @Select("select * from orders")
    @Results({
        @Result(id = true, property = "id", column = "id"),
        @Result(column = "orderNum",property = "orderNum"),
        @Result(column = "orderTime",property = "orderTime"),
        @Result(column = "orderStatus",property = "orderStatus"),
        @Result(column = "peopleCount",property = "peopleCount"),
        @Result(column = "payType",property = "payType"),
        @Result(column = "orderDesc",property = "orderDesc"),
        @Result(property = "product", column = "productId", javaType = Product.class,
        one = @One(select = "com.it.ssm.dao.ProductDao.findProductById"))

    })
    List<Orders> findAllOrders();
}
