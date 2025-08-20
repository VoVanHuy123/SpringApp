/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvh.services.impl;

import com.vvh.pojo.Category;
import com.vvh.repositories.CategoryRepository;
import com.vvh.services.CategoryServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class CategoryServicesImpl implements  CategoryServices{
    @Autowired
    private CategoryRepository cateRepo;

    @Override
    public List<Category> getCats() {
        return cateRepo.getCats();
    }

    @Override
    public Category getCateById(int id) {
        return  this.cateRepo.getCateById(id);
    }
    
}
