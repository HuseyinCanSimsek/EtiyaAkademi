package com.etiya.ecommercedemopair1.business.abstracts;

import com.etiya.ecommercedemopair1.business.dto.request.address.AddAddressRequest;
import com.etiya.ecommercedemopair1.business.dto.response.address.GetAddressResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAll();
    void addAddress(Address address);
    void addAddressWithInfo(AddAddressRequest addAddressRequest);
    GetAddressResponse getAddressWithInfo(AddAddressRequest addAddressRequest);


}
