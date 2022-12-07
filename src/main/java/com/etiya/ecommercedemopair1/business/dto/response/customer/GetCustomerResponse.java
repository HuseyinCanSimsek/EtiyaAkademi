package com.etiya.ecommercedemopair1.business.dto.response.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetCustomerResponse {
    private int Id;
    private String email;


    private String name;


    private String phone;

    private Date birth_date;
    private String gender;

}
