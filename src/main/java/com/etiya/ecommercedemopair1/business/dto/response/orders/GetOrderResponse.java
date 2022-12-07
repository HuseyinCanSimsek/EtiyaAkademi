package com.etiya.ecommercedemopair1.business.dto.response.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderResponse {
    private int Id;
    private Date orderDate;
    private String paymentMethod;
    private boolean isCompleted;
}
