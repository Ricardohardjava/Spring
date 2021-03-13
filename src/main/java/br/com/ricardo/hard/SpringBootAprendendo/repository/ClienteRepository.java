package br.com.ricardo.hard.SpringBootAprendendo.repository;

import br.com.ricardo.hard.SpringBootAprendendo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long > {



}
