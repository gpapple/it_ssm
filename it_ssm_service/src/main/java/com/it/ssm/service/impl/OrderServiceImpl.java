package com.it.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.it.ssm.dao.OrderDao;
import com.it.ssm.domain.Orders;
import com.it.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/22 - 21:14
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Orders> findAllOrders(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return orderDao.findAllOrders();
    }
}
