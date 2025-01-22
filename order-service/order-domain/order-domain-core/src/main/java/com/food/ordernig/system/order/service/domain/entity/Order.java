package com.food.ordernig.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.*;
import com.food.ordernig.system.order.service.domain.valueobject.StreetAddress;
import com.food.ordernig.system.order.service.domain.valueobject.TrackingId;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class Order extends AggregateRoot<OrderId> {
    private final CustomerId customerId;
    private final RestaurantId restaurantId;
    private final StreetAddress deliveryAddress;
    private final Money price;
    private final List<OrderItem> items;
    private final TrackingId trackingId;
    private final OrderStatus orderStatus;
    private List<String> failureMessages;

}
