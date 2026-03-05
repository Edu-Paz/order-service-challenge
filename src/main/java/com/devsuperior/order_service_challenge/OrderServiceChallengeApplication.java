package com.devsuperior.order_service_challenge;

import com.devsuperior.order_service_challenge.entities.Order;
import com.devsuperior.order_service_challenge.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceChallengeApplication implements CommandLineRunner {
    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceChallengeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 150, 20);

        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
    }

}
