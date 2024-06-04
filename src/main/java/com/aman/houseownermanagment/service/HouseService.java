package com.aman.houseownermanagment.service;

import com.aman.houseownermanagment.entities.House;

import java.util.Optional;

public interface HouseService {

    Optional<House> addHouse(House house);
    Optional<House> updateHouse(House house);
}
