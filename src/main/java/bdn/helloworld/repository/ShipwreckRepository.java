package bdn.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bdn.helloworld.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
