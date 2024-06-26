package com.x12.project11x12.facades.payments;

import com.x12.project11x12.payments.PaymentRequest;

public interface IPaymentFacade<T> {
    
    T createPaymentIntent(String type, PaymentRequest request) throws Exception;
    
}