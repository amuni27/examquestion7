package com.aman.houseownermanagment.repository;

import com.aman.houseownermanagment.entities.HouseOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseOwnerRepository extends JpaRepository<HouseOwner,Integer> {
}
