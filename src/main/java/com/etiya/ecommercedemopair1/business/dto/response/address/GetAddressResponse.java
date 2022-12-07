package com.etiya.ecommercedemopair1.business.dto.response.address;

import com.etiya.ecommercedemopair1.entities.concretes.City;
import com.etiya.ecommercedemopair1.entities.concretes.Country;
import com.etiya.ecommercedemopair1.entities.concretes.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAddressResponse {


    private int postalCode;
    private String street;
    private String title;
    private int userId;
    private int cityId;
    private int countryId;

}
