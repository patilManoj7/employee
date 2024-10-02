package com.crud.service;

import com.crud.entity.Customer;
import com.crud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Component
public class UserServices{
    @Autowired
    private final UserRepository userRepository;
    public Customer postCustomer(Customer customer)
    {

       return userRepository.save(customer);
    }
    public List<Customer> getcustomer(){
        return userRepository.findAll();
    }
    public Customer deleteCustomer(int id){
        try {
           Optional<Customer> data=userRepository.findById(id);
            userRepository.delete(data.get());
            return data.get();
        }catch (Exception e){
            return null;
        }
    }
    public Customer update(Customer customer){

              Optional<Customer> data= userRepository.findById(customer.getId());
              if(data.isPresent()) {
                  Customer customer1 = data.get();
                  customer1.setEmail(customer.getEmail());
                  customer1.setName((customer.getName()));
                  customer1.setPhone(customer.getPhone());
                  ;
                  userRepository.save(customer1);
                  return customer1;
              }else {
                  return null;
              }

    }


}
