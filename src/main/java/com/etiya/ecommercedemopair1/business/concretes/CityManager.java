package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.CityService;
import com.etiya.ecommercedemopair1.entities.concretes.City;
import com.etiya.ecommercedemopair1.repository.abstracts.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CityManager implements CityService {
    private CityRepository cityRepository;
    @Override
    public City findById(int id) {
        return cityRepository.findById(id);
    }

    @Override
    public boolean existsById(int id) {
        return cityRepository.existsById(id);
    }
}
