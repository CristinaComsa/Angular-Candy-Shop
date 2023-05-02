package com.candyshop.ecommerce.dto;

import com.candyshop.ecommerce.entity.Address;
import com.candyshop.ecommerce.entity.Customer;
import com.candyshop.ecommerce.entity.Order;
import com.candyshop.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
