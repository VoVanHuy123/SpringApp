/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vvh.services;

import com.vvh.pojo.Category;
import java.util.List;

/**
 *
 * @author admin
 */
public interface CategoryServices {
    public List<Category> getCats();
    public Category getCateById(int id);
}
