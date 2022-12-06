package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.SupplierService;
import com.etiya.ecommercedemopair1.business.dto.request.Supplier.AddSupplierRequest;
import com.etiya.ecommercedemopair1.business.dto.request.Supplier.AddSupplierRequest;
import com.etiya.ecommercedemopair1.business.dto.response.Supplier.GetSupplierResponse;
import com.etiya.ecommercedemopair1.business.dto.response.Supplier.GetSupplierResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Supplier;
import com.etiya.ecommercedemopair1.entities.concretes.Supplier;
import com.etiya.ecommercedemopair1.repository.abstracts.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierManager implements SupplierService {
    private SupplierRepository supplierRepository;
    @Autowired
    public SupplierManager(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }


    public void addSupplier(AddSupplierRequest addSupplierRequest) {
        Supplier supplier=new Supplier();
        supplier.setName(addSupplierRequest.getName());
        supplier.setEmail(addSupplierRequest.getEmail());
        supplier.setPhone(addSupplierRequest.getPhone());
        supplier.setBirth_date(addSupplierRequest.getBirth_date());
        supplier.setDescription(addSupplierRequest.getDescription());
        supplierRepository.save(supplier);
    }

    @Override
    public  GetSupplierResponse getSupplierWithInfo(AddSupplierRequest addSupplierRequest) {
        Supplier supplier=new Supplier();
        supplier.setName(addSupplierRequest.getName());
        supplier.setEmail(addSupplierRequest.getEmail());
        supplier.setPhone(addSupplierRequest.getPhone());
        supplier.setBirth_date(addSupplierRequest.getBirth_date());
        supplier.setDescription(addSupplierRequest.getDescription());
        supplierRepository.save(supplier);
        GetSupplierResponse getSupplierResponse=new GetSupplierResponse();
        getSupplierResponse.setName(supplier.getName());
        getSupplierResponse.setEmail(supplier.getEmail());
        getSupplierResponse.setPhone(supplier.getEmail());
        getSupplierResponse.setBirth_date(supplier.getBirth_date());
        getSupplierResponse.setDescription(supplier.getDescription());
        return getSupplierResponse;
    }
}
