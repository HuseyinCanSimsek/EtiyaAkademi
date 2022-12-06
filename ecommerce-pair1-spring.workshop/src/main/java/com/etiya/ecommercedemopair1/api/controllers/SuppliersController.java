package com.etiya.ecommercedemopair1.api.controllers;

import com.etiya.ecommercedemopair1.business.abstracts.SupplierService;
import com.etiya.ecommercedemopair1.business.dto.request.Supplier.AddSupplierRequest;
import com.etiya.ecommercedemopair1.business.dto.response.Supplier.GetSupplierResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/supplier")
public class SuppliersController {
    private SupplierService supplierService;
    @Autowired

    public SuppliersController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }
    @PostMapping("/addSupplier")
    public void addSupplier(@RequestBody AddSupplierRequest addSupplierRequest)
    {
        supplierService.addSupplier(addSupplierRequest);
    }
    @PostMapping("/addSupplierGetInfo")
    public GetSupplierResponse addSupplierGetInfo(@RequestBody AddSupplierRequest addSupplierRequest)
    {
        return supplierService.getSupplierWithInfo(addSupplierRequest);
    }
}
