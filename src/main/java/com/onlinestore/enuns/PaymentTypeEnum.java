package com.onlinestore.enuns;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentTypeEnum {
    CREDIT_CARD("Cartão de Crédito"),

    DEBIT_CARD("Cartão de Débito"),

    PAYPAL("PayPal"),

    BOLETO("Boleto Bancário"),

    PIX("PIX"),

    TRANSFER("Transferência Bancária");

    private final String displayName;
}
