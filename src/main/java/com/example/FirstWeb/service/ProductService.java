package com.example.FirstWeb.service;

import com.example.FirstWeb.model.Product;
import com.example.FirstWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    //List<Product> product = new ArrayList<>(Arrays.asList(new Product(101,"TV",9000),new Product(102,"aria",7000),new Product(103,"kia",8000)));

    public List<Product> getProduct(){

        return repo.findAll();
    }
    public Product getProductById(int prodId){
//        return product.stream()
//                .filter(p ->p.getProdId() == prodId)
//                .findFirst().orElse(new Product(100,"No user",0));

        return repo.findById(prodId).orElse(new Product());
    }

    public Product addProduct( Product prod){
//        product.add(prod);
//        return product.getLast();
        return repo.save(prod);
    }

    public void updateProduct(Product prod){
//        int index = 0;
//        for(int i = 0;i< product.size();i++){
//            if(product.get(i).getProdId() == prod.getProdId()){
//                index = i;
//            }
//        }
//        product.set(index,prod);
         repo.save(prod);
    }

    public void deleteProduct(int prodId){
//        Product result = product.stream()
//                .filter(p->p.getProdId() == prodId)
//                .findFirst()
//                .orElse(null);
//
//        if(result != null){
//            int index = product.indexOf(result);
//        }
//        product.remove(result);
        repo.deleteById(prodId);
    }
}
