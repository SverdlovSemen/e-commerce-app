package com.sverdlov.ecommerce.payment;

import com.sverdlov.ecommerce.customer.CustomerResponse;
import com.sverdlov.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference, // need to send it to the confirmation service
        CustomerResponse customer
) {
}
