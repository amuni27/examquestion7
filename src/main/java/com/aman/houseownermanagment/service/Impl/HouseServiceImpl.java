package com.aman.houseownermanagment.service.Impl;

import com.aman.houseownermanagment.entities.House;
import com.aman.houseownermanagment.entities.HouseOwner;
import com.aman.houseownermanagment.repository.HouseRepository;
import com.aman.houseownermanagment.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;

    @Override
    public Optional<House> addHouse(House house) {
        return Optional.of(houseRepository.save(house));
    }

    @Override
    public Optional<House> updateHouse(House house) {
        Optional<House> house1 = houseRepository.findById(house.getHouseId());
        if (house1.isPresent()) {
            house1.get().setHouseType(house.getHouseType());
            house1.get().setAddress(house.getAddress());
            house1.get().setHouseOwner(house.getHouseOwner());
        }
        return Optional.of(houseRepository.save(house1.get()));
    }
}
