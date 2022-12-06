package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.AddressService;
import com.etiya.ecommercedemopair1.business.dto.request.address.AddAddressRequest;
import com.etiya.ecommercedemopair1.business.dto.response.address.GetAddressResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Address;
import com.etiya.ecommercedemopair1.entities.concretes.User;
import com.etiya.ecommercedemopair1.repository.abstracts.AddressRepository;
import com.etiya.ecommercedemopair1.repository.abstracts.CityRepository;
import com.etiya.ecommercedemopair1.repository.abstracts.CountryRepository;
import com.etiya.ecommercedemopair1.repository.abstracts.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressManager implements AddressService {

    private AddressRepository addressRepository;
    private UserRepository userRepository;
    private CityRepository cityRepository;
    private CountryRepository countryRepository;
    @Autowired
    public AddressManager(AddressRepository addressRepository,UserRepository userRepository,CityRepository cityRepository,CountryRepository countryRepository) {
        this.addressRepository = addressRepository;
        this.userRepository=userRepository;
        this.cityRepository=cityRepository;
        this.countryRepository=countryRepository;
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void addAddressWithInfo(AddAddressRequest addAddressRequest) {
        Address address=new Address();
        address.setStreet(addAddressRequest.getStreet());
        address.setTitle(addAddressRequest.getTitle());
        address.setPostalCode(addAddressRequest.getPostalCode());
       address.setUser(userRepository.findById(addAddressRequest.getUserId()));
        address.setCity(cityRepository.findById(addAddressRequest.getCityId()));
        address.setCountry(countryRepository.findById(addAddressRequest.getCountryId()));
        addressRepository.save(address);
    }

    @Override
    public GetAddressResponse getAddressWithInfo(AddAddressRequest addAddressRequest) {
        Address address=new Address();
        address.setStreet(addAddressRequest.getStreet());
        address.setTitle(addAddressRequest.getTitle());
        address.setPostalCode(addAddressRequest.getPostalCode());
        address.setUser(userRepository.findById(addAddressRequest.getUserId()));
        address.setCity(cityRepository.findById(addAddressRequest.getCityId()));
        address.setCountry(countryRepository.findById(addAddressRequest.getCountryId()));
        addressRepository.save(address);
        GetAddressResponse getAddressResponse=new GetAddressResponse(address.getPostalCode(),address.getStreet(),address.getTitle(),address.getUser().getId(),address.getCity().getId(),address.getCountry().getId());
        return  getAddressResponse;

    }

}
