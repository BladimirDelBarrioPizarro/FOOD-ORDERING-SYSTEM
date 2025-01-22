package com.food.ordernig.system.order.service.domain.valueobject;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class StreetAddress {
    private final UUID id;
    private final String street;
    private final String postalCode;
    private final String city;
}
