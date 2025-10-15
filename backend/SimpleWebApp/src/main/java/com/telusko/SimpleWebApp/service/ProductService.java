package com.telusko.SimpleWebApp.service;

import com.telusko.SimpleWebApp.model.Product;
import com.telusko.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return  repo.findAll();
    }

    public Product getProductsById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
      repo.save(prod);
    }

    public void deleteProduct(int prodId) {
      repo.deleteById(prodId);

    }

//    List<Product> products = new ArrayList<>( Arrays.asList(new Product(1,"Iphone",5000),
//            new Product(22, "Apple watch", 1000)));

//    public List<Product> getProducts(){
//        return  products;
//    }
//
//    public Product getProductsById(int prodId) {
//        return products.stream().filter(p->p.getProdId()==prodId).findFirst().get();
//    }
//
//    public void addProduct(Product prod){
//        products.add(prod);
//    }
//
//    public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0;i<products.size();i++) {
//            if (products.get(i).getProdId() == prod.getProdId()) index = i;
//        }
//        products.set(index, prod);
//    }
//
//    public void deleteProduct(int prodId) {
//        int index=0;
//        for(int i=0;i<products.size();i++) {
//            if (products.get(i).getProdId() == prodId) index = i;
//        }
//        products.remove(index);
//
//    }
}
