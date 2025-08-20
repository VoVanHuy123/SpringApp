/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvh.controllers;

import com.vvh.repositories.impl.CategoryRepositoryImpl;
import com.vvh.repositories.impl.ProductRepositoryImpl;
import com.vvh.services.CategoryServices;
import com.vvh.services.ProductServices;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author admin
 */
@Controller
@ControllerAdvice
public class IndexController {
    @Autowired
    private CategoryServices cate;
    @Autowired
    private ProductServices proRepo;
    
    @ModelAttribute
    private void commonResponse(Model model){
        model.addAttribute("cate",this.cate.getCats());
    }
    @RequestMapping("/")
    public String index(Model model,@RequestParam Map<String,String> params) {
        model.addAttribute("msg","hello word");
        
        model.addAttribute("products",this.proRepo.getProducts(params));
        return "index";
    }
}
