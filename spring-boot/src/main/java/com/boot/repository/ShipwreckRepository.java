package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Shipwreck;

//Thats all needs to be done!!. This repository will enable all CURD operations on Shipwreck model object, like findAll(), findOne(id), update(Shipwreck), delete(Shipwreck), create(Shipwreck). 
//See the controller on how to execute CRUD operations using this repository.
//NOTE: no concrete implementation class needed, spring provides all CRUD related implementations out of the box.
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
