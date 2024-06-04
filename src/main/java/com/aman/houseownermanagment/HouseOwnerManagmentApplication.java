package com.aman.houseownermanagment;

import com.aman.houseownermanagment.entities.House;
import com.aman.houseownermanagment.entities.HouseOwner;
import com.aman.houseownermanagment.repository.HouseRepository;
import com.aman.houseownermanagment.service.HouseOwnerService;
import com.aman.houseownermanagment.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class HouseOwnerManagmentApplication implements CommandLineRunner {

    private final HouseService houseService;
    private final HouseOwnerService houseOwnerService;


    public static void main(String[] args) {
        SpringApplication.run(HouseOwnerManagmentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        HouseOwner houseOwner= new HouseOwner("Amanuel","Lawro","4698945635");
        HouseOwner houseOwner1= new HouseOwner("Hile","Kokeb","2548647835");
        HouseOwner houseOwner2= new HouseOwner("Melaku","Nigatu","3152486974");
        HouseOwner houseOwner3= new HouseOwner("Melat","Lawro","1124587569");
        houseOwnerService.addNewHouseOwner(houseOwner);
        houseOwnerService.addNewHouseOwner(houseOwner1);
        houseOwnerService.addNewHouseOwner(houseOwner2);
        houseOwnerService.addNewHouseOwner(houseOwner3);
        House house = new House("Apartment","Fairfield",houseOwner);
        House house1 = new House("Condominium","Fairfield",houseOwner);
        House house2 = new House("House","Fairfield",houseOwner);
        House house3 = new House("Apartment","ottouma",houseOwner);
        House house4 = new House("House","ottouma",houseOwner);
        houseService.addHouse(house);
        houseService.addHouse(house1);
        houseService.addHouse(house2);
        houseService.addHouse(house3);
        houseService.addHouse(house4);


        houseOwner.setLastName("Gizachew");
        houseOwnerService.updateHouseOwner(houseOwner);

        List<HouseOwner> houseOwners= houseOwnerService.getAllHouseOwner();

        houseOwners
                .stream()
                .sorted(Comparator.comparing(HouseOwner::getPhoneNumber))
                .forEach(owner-> System.out.println(owner.toString()));




    }
}
