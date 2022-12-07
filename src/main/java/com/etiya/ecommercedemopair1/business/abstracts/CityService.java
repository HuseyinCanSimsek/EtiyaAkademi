package com.etiya.ecommercedemopair1.business.abstracts;

import com.etiya.ecommercedemopair1.entities.concretes.City;

public interface CityService {
    City findById(int id);
    boolean existsById(int id);
}
