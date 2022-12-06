package com.etiya.ecommercedemopair1.business.abstracts;

import com.etiya.ecommercedemopair1.business.dto.request.Supplier.AddSupplierRequest;
import com.etiya.ecommercedemopair1.business.dto.response.Supplier.GetSupplierResponse;

public interface SupplierService {
    void addSupplier(AddSupplierRequest addSupplierRequest);
    GetSupplierResponse getSupplierWithInfo(AddSupplierRequest addSupplierRequest);



}
