package com.crud.controller;

import com.crud.entity.Customer;
import com.crud.service.UserServices;
import io.micrometer.common.lang.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200/")
public class CustomerController {
    private  final UserServices services;

    @PostMapping("/post_customer")
    public Customer postCustomer(@RequestBody Customer customer){
        return services.postCustomer(customer);
    }
@GetMapping("/get_Customer")
    public List<Customer> getallcusotmer(){

        return services.getcustomer();

}
@DeleteMapping("/deleteCustomer")
    public Customer deletCustomer(@RequestParam int id){

        return services.deleteCustomer(id);

}
@PutMapping("/updatecustomer")
    public  Customer updateCustomer(@RequestBody Customer customer){
        return services.update(customer);
}



}
