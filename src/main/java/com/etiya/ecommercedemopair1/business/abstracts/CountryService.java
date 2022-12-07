package com.etiya.ecommercedemopair1.business.abstracts;

import com.etiya.ecommercedemopair1.entities.concretes.Country;

public interface CountryService {
    Country findById(int id);
    boolean existsById(int id);
}
