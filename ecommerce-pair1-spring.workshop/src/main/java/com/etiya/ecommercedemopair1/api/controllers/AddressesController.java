package com.etiya.ecommercedemopair1.api.controllers;

import com.etiya.ecommercedemopair1.business.abstracts.AddressService;
import com.etiya.ecommercedemopair1.business.dto.request.address.AddAddressRequest;
import com.etiya.ecommercedemopair1.business.dto.response.address.GetAddressResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Address;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressesController {
    private AddressService addressService;
    @Autowired
    public AddressesController(AddressService addressService) {
        this.addressService = addressService;
    }
    @GetMapping("/getAllAddresses")
    public List<Address> getAllAddresses()
    {
        return  addressService.getAll();
    }
    @PostMapping("/addAddress")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }
    @PostMapping("/addAddressWithInfo")
    public void addAddressWithInfo(AddAddressRequest addAddressRequest)
    {
        addressService.addAddressWithInfo(addAddressRequest);
    }
    @PostMapping("/addAddressGetInfo")
    public ResponseEntity<GetAddressResponse>  addAddressGetInfo( AddAddressRequest addressRequest)
    {
        return new ResponseEntity<GetAddressResponse>(addressService.getAddressWithInfo(addressRequest), HttpStatus.CREATED);
    }
    @PostMapping("/addAddressGetInfoAlternative")
    public GetAddressResponse addressResponse( AddAddressRequest addAddressRequest)
    {
        return  addressService.getAddressWithInfo(addAddressRequest);
    }
}
