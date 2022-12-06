package com.etiya.ecommercedemopair1.business.dto.request.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {

    private String email;


    private String name;


    private String phone;

    private Date birth_date;
    private String gender;
}
