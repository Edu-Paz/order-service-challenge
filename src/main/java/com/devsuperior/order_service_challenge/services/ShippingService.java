package com.devsuperior.order_service_challenge.services;

import com.devsuperior.order_service_challenge.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        if(order.getBasic() < 100){
            return 20;
        }
        if(order.getBasic() >= 100 && order.getBasic() < 200){
            return 12;
        }
        else{
            return 0;
        }
    }
}
