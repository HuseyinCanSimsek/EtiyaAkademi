package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.CountryService;
import com.etiya.ecommercedemopair1.entities.concretes.Country;
import com.etiya.ecommercedemopair1.repository.abstracts.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CountryManager implements CountryService {
    private CountryRepository countryRepository;
    @Override
    public Country findById(int id) {
        return countryRepository.findById(id);
    }

    @Override
    public boolean existsById(int id) {
        return countryRepository.existsById(id);
    }
}
