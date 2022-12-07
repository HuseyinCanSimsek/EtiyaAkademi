package com.etiya.ecommercedemopair1.business.dto.request.address;

import com.etiya.ecommercedemopair1.entities.concretes.City;
import com.etiya.ecommercedemopair1.entities.concretes.Country;
import com.etiya.ecommercedemopair1.entities.concretes.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAddressRequest {

    private int postalCode;
    private String street;
    private String title;
    @Min(value = 0)
    @NotNull
    private int userId;
    @Min(value = 0)
    private int cityId;
    @Min(value=0)
    private int countryId;

}
