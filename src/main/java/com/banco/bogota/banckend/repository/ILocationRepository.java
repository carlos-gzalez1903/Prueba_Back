package com.banco.bogota.banckend.repository;

import com.banco.bogota.banckend.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILocationRepository extends JpaRepository<Location,Integer> {

    List<Location> findAll();
}
