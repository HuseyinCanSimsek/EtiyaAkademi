package com.etiya.ecommercedemopair1.business.dto.response.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCategoryResponse {
    private int Id;
    private String name;
}
