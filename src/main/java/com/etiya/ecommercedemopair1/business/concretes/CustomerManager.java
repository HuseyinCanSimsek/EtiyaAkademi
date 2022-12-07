package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair1.business.dto.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair1.business.dto.response.customer.GetCustomerResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Customer;
import com.etiya.ecommercedemopair1.repository.abstracts.CustomerRepository;
import com.etiya.ecommercedemopair1.çore.util.mapping.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {
    private final CustomerRepository customerRepository;
    private final MapperService mapperService;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository,MapperService mapperService) {
        this.customerRepository = customerRepository;
        this.mapperService=mapperService;

    }



    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(int id) {
        return customerRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Customer> getCustomerWithGender(String gender) {
        return customerRepository.getCustomerWithGender(gender);
    }

    @Override
    public String findEmailByName(String name) {
        return customerRepository.findEmailByName(name);
    }

    @Override
    public void addCustomer(AddCustomerRequest addCustomerRequest) {
       /* Customer customer=new Customer();
        customer.setName(addCustomerRequest.getName());
        customer.setEmail(addCustomerRequest.getEmail());
        customer.setPhone(addCustomerRequest.getPhone());
        customer.setBirth_date(addCustomerRequest.getBirth_date());
        customer.setGender(addCustomerRequest.getGender());*/
        Customer customer=mapperService.getMapperforRequest().map(addCustomerRequest,Customer.class);
         customerRepository.save(customer);
    }

    @Override
    public GetCustomerResponse addCustomerWithCustomerInfo(AddCustomerRequest addCustomerRequest) {
       /* Customer customer=new Customer();
        customer.setName(addCustomerRequest.getName());
        customer.setEmail(addCustomerRequest.getEmail());
        customer.setPhone(addCustomerRequest.getPhone());
        customer.setBirth_date(addCustomerRequest.getBirth_date());
        customer.setGender(addCustomerRequest.getGender());
        customerRepository.save(customer);
        GetCustomerResponse getCustomerResponse=new GetCustomerResponse();
        getCustomerResponse.setId(customer.getId());
        getCustomerResponse.setName(customer.getName());
        getCustomerResponse.setEmail(customer.getEmail());
        getCustomerResponse.setPhone(customer.getEmail());
        getCustomerResponse.setBirth_date(customer.getBirth_date());
        getCustomerResponse.setGender(customer.getGender());*/
        Customer customer=mapperService.getMapperforRequest().map(addCustomerRequest,Customer.class);
        customerRepository.save(customer);
        GetCustomerResponse getCustomerResponse=mapperService.getMapperforResponse().map(customer,GetCustomerResponse.class);
        return getCustomerResponse;
    }
}
