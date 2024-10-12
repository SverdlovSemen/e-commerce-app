package com.sverdlov.ecommerce.kafka;

import com.sverdlov.ecommerce.customer.CustomerResponse;
import com.sverdlov.ecommerce.order.PaymentMethod;
import com.sverdlov.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
