package org.example.singleResponsibility.problem;

public interface IEcommerce {
    void addProductInCart(String product);
    void removeProductFromCart(String product);
    void placeOrder(Long id);
    void cancelOrder(Long id);
    void trackOrder(Long id);
    void createUser(String userName,Long age);
}
