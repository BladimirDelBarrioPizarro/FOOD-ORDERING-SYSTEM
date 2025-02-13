package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.dataaccess.order.adapter.OrderRepositoryImpl;
import com.food.ordering.system.order.service.domain.ports.output.repository.OrderRepository;
import com.food.ordernig.system.order.service.domain.OrderDomainService;
import com.food.ordernig.system.order.service.domain.OrderDomainServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public OrderDomainService orderDomainService() {
        return new OrderDomainServiceImpl();
    }

}
