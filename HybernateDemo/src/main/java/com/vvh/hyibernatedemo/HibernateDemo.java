/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.vvh.hyibernatedemo;

import com.vvh.pojo.Product;
import com.vvh.repositories.impl.CategoryRepositoryImpl;
import com.vvh.repositories.impl.ProductRepositoryImpl;
import com.vvh.repositories.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
//        CategoryRepositoryImpl c = new CategoryRepositoryImpl();
//
//        c.getCats().forEach(cat -> {
//            System.out.println(cat.getName());
//        });

//            ProductRepositoryImpl productRepo = new ProductRepositoryImpl();
//            Map<String,String> params = new HashMap<>();
//            params.put("orderBy", "price");
//            productRepo.getProducts(params).forEach(pro -> {
//                System.out.printf("%s - %.1f\n",pro.getName(),pro.getPrice());
//            });
//        CategoryRepositoryImpl c1 = new CategoryRepositoryImpl();
//        ProductRepositoryImpl p1 = new ProductRepositoryImpl();
//        
//
//        Product p = new Product();
//        p.setName("TEST");
//        p.setPrice(20000l);
//        p.setCategoryId(c1.getCateById(1));
//        
//        p1.addOrUpdate(p);


        StatsRepositoryImpl s5 =new StatsRepositoryImpl();
        s5.getRevenueByProduct().forEach( p -> System.out.printf("%d - %s: %d\n",p[0],p[1],p[2]));

    }
}
