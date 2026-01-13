package com.vitormwxn.desafio01.service;

import com.vitormwxn.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public ShippingService getShippingService() {
        return shippingService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total (Order order) {

        double discountValue = order.getBasic() * (order.getDiscount() / 100.0);

        return (order.getBasic() - discountValue) + shippingService.shipment(order);
    }
}
