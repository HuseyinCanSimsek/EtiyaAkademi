package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.*;
import com.etiya.ecommercedemopair1.business.dto.request.address.AddAddressRequest;
import com.etiya.ecommercedemopair1.business.dto.response.address.GetAddressResponse;
import com.etiya.ecommercedemopair1.entities.concretes.*;
import com.etiya.ecommercedemopair1.repository.abstracts.AddressRepository;
import com.etiya.ecommercedemopair1.repository.abstracts.CityRepository;
import com.etiya.ecommercedemopair1.repository.abstracts.CountryRepository;
import com.etiya.ecommercedemopair1.repository.abstracts.UserRepository;
import com.etiya.ecommercedemopair1.çore.util.mapping.MapperService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressManager implements AddressService {

    private AddressRepository addressRepository;
    private UserService userService;
    private CityService cityService;
    private CountryService countryService;
    private MapperService mapperService;


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

        /*Address address=new Address();
        address.setStreet(addAddressRequest.getStreet());
        address.setTitle(addAddressRequest.getTitle());
        address.setPostalCode(addAddressRequest.getPostalCode());
       address.setUser(userService.findById(addAddressRequest.getUserId()));
        address.setCity(cityService.findById(addAddressRequest.getCityId()));
        address.setCountry(countryService.findById(addAddressRequest.getCountryId()));*/
        Address address=mapperService.getMapperforRequest().map(addAddressRequest,Address.class);
        checkUserExists(addAddressRequest.getUserId());
        checkCityExists(addAddressRequest.getCityId());
        checkCountryExists(addAddressRequest.getCountryId());
        addressRepository.save(address);
    }

    @Override
    public GetAddressResponse getAddressWithInfo(AddAddressRequest addAddressRequest) {
       /* Address address=new Address();
        address.setStreet(addAddressRequest.getStreet());
        address.setTitle(addAddressRequest.getTitle());
        address.setPostalCode(addAddressRequest.getPostalCode());
        address.setUser(userService.findById(addAddressRequest.getUserId()));
        checkUserExists(addAddressRequest.getUserId());
        address.setCity(cityService.findById(addAddressRequest.getCityId()));
        checkCityExists(addAddressRequest.getCityId());
        address.setCountry(countryService.findById(addAddressRequest.getCountryId()));
        checkCountryExists(addAddressRequest.getCountryId());
        addressRepository.save(address);
        GetAddressResponse getAddressResponse=new GetAddressResponse(address.getPostalCode(),address.getStreet(),address.getTitle(),address.getUser().getId(),address.getCity().getId(),address.getCountry().getId());*/
        //Auto Mapping
        Address address=mapperService.getMapperforRequest().map(addAddressRequest,Address.class);
        checkUserExists(addAddressRequest.getUserId());
        checkCityExists(addAddressRequest.getCityId());
        checkCountryExists(addAddressRequest.getCountryId());
        addressRepository.save(address);
        GetAddressResponse getAddressResponse=mapperService.getMapperforResponse().map(address,GetAddressResponse.class);
        return  getAddressResponse;

    }
    private void checkUserExists(int id) {

        boolean isExist = userService.existsById(id);
        if (!isExist) {
            throw new RuntimeException("This user doesn't exist");
        }
    }

    private void checkCityExists(int id) {

        boolean isExist = cityService.existsById(id);
        if (!isExist) {
            throw new RuntimeException("This city doesn't exist");
        }
    }

    private void checkCountryExists(int id) {

        boolean isExist = countryService.existsById(id);
        if (!isExist) {
            throw new RuntimeException("This country doesn't exist");
        }
    }


}
