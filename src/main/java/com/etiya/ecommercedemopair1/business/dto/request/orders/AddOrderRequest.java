package com.etiya.ecommercedemopair1.business.dto.request.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderRequest {

    private Date orderDate;
    private String paymentMethod;
    private boolean isCompleted;
}
