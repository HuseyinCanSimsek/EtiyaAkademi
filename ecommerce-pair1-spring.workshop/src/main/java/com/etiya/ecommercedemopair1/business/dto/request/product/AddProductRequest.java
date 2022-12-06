package com.etiya.ecommercedemopair1.business.dto.request.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
    private String name;
    private double unitPrice;
    private int stock;
    private double discountRate;

}
