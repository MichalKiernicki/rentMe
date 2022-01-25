package com.rentMe.rentMe.repository;

import com.rentMe.rentMe.model.Apartament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartamentRepository extends JpaRepository<Apartament, Long> {
}
