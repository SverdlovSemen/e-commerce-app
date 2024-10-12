package com.sverdlov.ecommerce.kafka.order;

import java.math.BigDecimal;

public record Product(
        Integer produtId,
        String name,
        String description,
        BigDecimal price,
        double quantity
) {
}
