package com.ingaru.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

//List<Product> products = new ArrayList<>();
    @Autowired
    ProductsDB db;
//
//    public void addProduct(Product p){
//        products.add(p);
//    }

    public List<Product> getAllProducts(){
        return db.findAll();
    }

//    public Product getProduct(String name) {
//        return products.stream().filter(p->p.getName().equals(name)).findFirst().orElse(null);
//    }

//    public List<Product> getProductWithText(String text) {
//        String str = text.toLowerCase();
//
//        return products.stream()
//                .filter(p->(p.getName().toLowerCase().contains(str))||
//                        p.getPlace().toLowerCase().contains(str))
//                .toList();
//
//    }

//    public List<Product> getProductByPlace (String text){
//        return products.stream()
//                .filter(p->p.getPlace().toLowerCase().equals(text.toLowerCase()))
//                .toList();
//
//    }
//
//    public List<Product> getProductOutOfWarranty (){
//        return products.stream().filter(p->p.getWarranty()+1<Year.now().getValue()).toList();
//    }

}
