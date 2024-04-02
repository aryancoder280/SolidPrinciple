package org.example.singleResponsibility.problem;

public class EcommerceImpl implements IEcommerce{
    @Override
    public void addProductInCart(String product) {
        // do some work related to add product
    }

    @Override
    public void removeProductFromCart(String product) {
        // do some work related to remove product
    }

    @Override
    public void placeOrder(Long id) {
        // do some work related to place the product
    }

    @Override
    public void cancelOrder(Long id) {
        // do some work related to cancel product
    }

    @Override
    public void trackOrder(Long id) {
        // do some work related to track the product
    }

    @Override
    public void createUser(String userName, Long age) {
        // do some work related to create a user
    }
}
