package br.com.crud.crudgenerico.temperatura;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperaturaRepository extends JpaRepository<Temperatura, Long> {
}
