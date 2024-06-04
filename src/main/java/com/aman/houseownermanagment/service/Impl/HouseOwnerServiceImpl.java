package com.aman.houseownermanagment.service.Impl;

import com.aman.houseownermanagment.entities.HouseOwner;
import com.aman.houseownermanagment.repository.HouseOwnerRepository;
import com.aman.houseownermanagment.service.HouseOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HouseOwnerServiceImpl implements HouseOwnerService {
    private final HouseOwnerRepository houseOwnerRepository;

    @Override
    public Optional<HouseOwner> addNewHouseOwner(HouseOwner houseOwner) {
        return Optional.of(houseOwnerRepository.save(houseOwner));
    }

    @Override
    public Optional<HouseOwner> updateHouseOwner(HouseOwner houseOwner) {
        Optional<HouseOwner> houseOwner1 = houseOwnerRepository.findById(houseOwner.getOwnerId());
        if (houseOwner1.isPresent()) {
            houseOwner1.get().setFirstName(houseOwner.getFirstName());
            houseOwner1.get().setLastName(houseOwner.getLastName());
            houseOwner1.get().setHouses(houseOwner.getHouses());
        }
        return Optional.of(houseOwnerRepository.save(houseOwner1.get()));
    }

    @Override
    public List<HouseOwner> getAllHouseOwner() {
        return houseOwnerRepository.findAll();
    }

}
