package org.mateuszziebura.mzthymeleaf.services;



import org.mateuszziebura.mzthymeleaf.domain.Product;

import java.util.List;

/**
 * Created by jt on 1/26/16.
 */
public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
