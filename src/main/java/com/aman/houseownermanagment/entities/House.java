package com.aman.houseownermanagment.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "house")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer houseId;
    private String houseType;
    private String address;
    @ManyToOne
    @JoinColumn(name = "houseOwner_id")
    private HouseOwner houseOwner;

    public House(String houseType, String address, HouseOwner houseOwner) {
        this.houseType = houseType;
        this.address = address;
        this.houseOwner = houseOwner;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseId=" + houseId +
                ", houseType='" + houseType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
