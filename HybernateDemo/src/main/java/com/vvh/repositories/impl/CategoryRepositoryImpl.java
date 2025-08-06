/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvh.repositories.impl;

import com.vvh.hyibernatedemo.HibernateUtils;
import com.vvh.pojo.Category;
import com.vvh.pojo.Product;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class CategoryRepositoryImpl {

    public List<Category> getCats() {
        try (Session s = HibernateUtils.getFACTORY().openSession()) {
            Query q = s.createQuery("FROM Category", Category.class);
            return q.getResultList();
        }
    }

    public Category getCateById(int id) {
//        try (Session s = HibernateUtils.getFACTORY().openSession()) {
//            CriteriaBuilder b = s.getCriteriaBuilder();
//            CriteriaQuery<Category> query = b.createQuery(Category.class);
//            Root root = query.from(Category.class);
//            query.select(root).where(b.equal(root.get("id"), id));
//
//            return s.createQuery(query).uniqueResult();
//        }
        try (Session s = HibernateUtils.getFACTORY().openSession()) {
            return s.find(Category.class, id);
           
        }
    }
}
