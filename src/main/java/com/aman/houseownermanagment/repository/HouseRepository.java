package com.aman.houseownermanagment.repository;

import com.aman.houseownermanagment.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House,Integer> {
}
