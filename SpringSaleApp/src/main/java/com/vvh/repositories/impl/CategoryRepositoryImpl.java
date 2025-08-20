/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvh.repositories.impl;


import com.vvh.pojo.Category;
import com.vvh.pojo.Product;
import com.vvh.repositories.CategoryRepository;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository{
    @Autowired
    private  LocalSessionFactoryBean factory;

    public List<Category> getCats() {
        Session s = this.factory.getObject().getCurrentSession();
            Query q = s.createQuery("FROM Category", Category.class);
            return q.getResultList();
        
    }

    public Category getCateById(int id) {
        Session s = this.factory.getObject().getCurrentSession();
            return s.find(Category.class, id);
           
        
    }
}
