package service;

import model.Customer;
import model.Product;

public interface CashierService {
void sell(Customer customer, Product product);
Product sell(Product product);
}
