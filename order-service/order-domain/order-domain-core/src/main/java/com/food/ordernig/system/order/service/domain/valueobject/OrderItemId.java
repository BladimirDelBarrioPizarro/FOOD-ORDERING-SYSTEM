package com.food.ordernig.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {

    protected OrderItemId(Long value) {
        super(value);
    }
}
