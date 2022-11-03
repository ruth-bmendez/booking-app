package Grupo7.DHBooking.Service;

import Grupo7.DHBooking.Entities.Product;

import java.util.List;

public interface IProductService {

    Product createProduct(Product product);
    Product getProductById(Long idProduct);
    Product updateProduct(Product product);
    void deleteProduct(Long idProduct);
    List<Product> getAll();

}
