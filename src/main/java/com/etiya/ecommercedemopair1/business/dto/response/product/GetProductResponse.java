package com.etiya.ecommercedemopair1.business.dto.response.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {
    private String name;
    private int stock;
    private double unitPrice;
    private double discountRate;
}
