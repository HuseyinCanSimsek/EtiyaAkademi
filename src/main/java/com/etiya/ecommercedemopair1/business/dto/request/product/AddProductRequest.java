package com.etiya.ecommercedemopair1.business.dto.request.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
    @NotBlank()
    @NotNull()
    @Size(min = 3,max = 50)
    private String name;
    @Min(value = 1)
    private double unitPrice;
    @Min(value=0)
    private int stock;
    private double discountRate;
    private int categoryId;

}
