package com.etiya.ecommercedemopair1.api.controllers;

import com.etiya.ecommercedemopair1.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair1.business.dto.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair1.business.dto.response.customer.GetCustomerResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
    private final CustomerService customerService;

    @Autowired
    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAll")
    public List<Customer> getAll(){
        return customerService.getAll();
    }
    @GetMapping("/getCustomerByGender")
    public List<Customer>  getCustomerWithGender(@RequestParam("gender") String gender)
    {
        return customerService.getCustomerWithGender(gender);
    }
    @GetMapping("/getEmail/{name}")
    public String findEmailByName(@PathVariable String name)
    {
        return customerService.findEmailByName(name);
    }
    @PostMapping(value="/addCustomer",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCustomer(@RequestBody AddCustomerRequest addCustomerRequest)
    {
        customerService.addCustomer(addCustomerRequest);
    }
    @PostMapping("/addCustomerWithCustomerInfo")
    public ResponseEntity<GetCustomerResponse> addCustomerWithCustomerInfo(@RequestBody AddCustomerRequest addCustomerRequest)
    {
        return new ResponseEntity<GetCustomerResponse>(customerService.addCustomerWithCustomerInfo(addCustomerRequest), HttpStatus.CREATED);
    }

}
