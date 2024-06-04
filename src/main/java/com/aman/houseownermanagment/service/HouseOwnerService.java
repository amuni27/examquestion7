package com.aman.houseownermanagment.service;

import com.aman.houseownermanagment.entities.HouseOwner;
import com.aman.houseownermanagment.repository.HouseOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface HouseOwnerService {


    Optional<HouseOwner> addNewHouseOwner(HouseOwner houseOwner);
    Optional<HouseOwner> updateHouseOwner(HouseOwner houseOwner);
    List<HouseOwner> getAllHouseOwner();
}
