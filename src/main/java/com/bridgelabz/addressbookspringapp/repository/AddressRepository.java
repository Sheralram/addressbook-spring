package com.bridgelabz.addressbookspringapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bridgelabz.addressbookspringapp.entity.AddressEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Integer> {
}
