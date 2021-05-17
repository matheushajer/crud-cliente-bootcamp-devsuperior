package com.matheushajer.crudcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheushajer.crudcliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
