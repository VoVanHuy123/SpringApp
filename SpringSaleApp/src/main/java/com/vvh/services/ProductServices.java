/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vvh.services;

import com.vvh.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface ProductServices {
    public List<Product> getProducts(Map<String, String> params);
    public void deleteProduct(int id);
    public Product getProductById(int id);
    public void addOrUpdate(Product p);
}
