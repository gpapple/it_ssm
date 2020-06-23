package com.it.ssm.service;

import com.it.ssm.domain.Orders;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/22 - 21:13
 */
public interface OrderService {

    List<Orders> findAllOrders(int pageNum, int pageSize);
}
