package com.it.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.it.ssm.domain.Orders;
import com.it.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/22 - 21:11
 */

@RequestMapping("/orders")
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAllOrders(@RequestParam(name = "page", required = true, defaultValue = "1") int pageNum,
                                      @RequestParam(name = "size", required = true, defaultValue = "4") int pageSize){
        ModelAndView mv = new ModelAndView();
        List<Orders> orderList = orderService.findAllOrders(pageNum, pageSize);
        PageInfo<Orders> pageInfo = new PageInfo<>(orderList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }
}
