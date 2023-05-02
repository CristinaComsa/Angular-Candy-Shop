package com.candyshop.ecommerce.service;

import com.candyshop.ecommerce.dto.Purchase;
import com.candyshop.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
