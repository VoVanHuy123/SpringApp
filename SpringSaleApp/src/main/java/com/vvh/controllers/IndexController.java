/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvh.controllers;

import com.vvh.repositories.impl.CategoryRepositoryImpl;
import com.vvh.repositories.impl.ProductRepositoryImpl;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author admin
 */
@Controller
public class IndexController {
    @Autowired
    private CategoryRepositoryImpl cate;
    @Autowired
    private ProductRepositoryImpl proRepo;
    @RequestMapping("/")
    public String index(Model model,@RequestParam Map<String,String> params) {
        model.addAttribute("msg","hello word");
        model.addAttribute("cate",cate.getCats());
        model.addAttribute("products",proRepo.getProducts(params));
        return "index";
    }
}
