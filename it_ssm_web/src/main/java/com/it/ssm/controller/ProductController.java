package com.it.ssm.controller;

import com.it.ssm.domain.Product;
import com.it.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/21 - 16:07
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findProductAll(){
        ModelAndView mv = new ModelAndView();
        List<Product> productList = productService.findProductAll();
        mv.addObject("productList", productList);
        mv.setViewName("product-list");
        return mv;
    }
}
