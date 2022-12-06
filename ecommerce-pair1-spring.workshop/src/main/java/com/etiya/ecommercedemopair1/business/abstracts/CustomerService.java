package com.etiya.ecommercedemopair1.business.abstracts;

import com.etiya.ecommercedemopair1.business.dto.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair1.business.dto.response.customer.GetCustomerResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    Customer getById(int id);
    List<Customer> getCustomerWithGender(String gender);
    String findEmailByName(String name);
    void addCustomer(AddCustomerRequest addCustomerRequest);
    GetCustomerResponse addCustomerWithCustomerInfo(AddCustomerRequest addCustomerRequest);

}
