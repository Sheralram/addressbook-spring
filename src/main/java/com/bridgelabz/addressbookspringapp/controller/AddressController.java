package com.bridgelabz.addressbookspringapp.controller;

import com.bridgelabz.addressbookspringapp.dto.AddressDto;
import com.bridgelabz.addressbookspringapp.entity.AddressEntity;
import com.bridgelabz.addressbookspringapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping(value = "/address-book")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value="/list-all-address")
    public List<AddressEntity> getAllAddressBook(){
        return addressService.getAllAddressBook();
    }

    @PostMapping(value = "/create")
    public String addAddressBook(@Valid @RequestBody AddressDto addressDto){
    return addressService.addAddressBook(addressDto);
    }

    @PutMapping(value= "/update/{id}")
    public String updateAddressBook(@PathVariable int id,@Valid @RequestBody AddressDto addressDto){
        return  addressService.updateAddressBook(id,addressDto);
    }

//    @DeleteMapping(value = "/delete")
//    public String deleteAddressBook(@Valid @RequestParam int id){
//        return addressService.deleteAddressBook(id);
//    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteAddressBook(@Valid @PathVariable int id){
        return addressService.deleteAddressBook(id);
    }


}
