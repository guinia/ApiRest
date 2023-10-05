package com.example.ApiRest.repositorios;

import com.example.ApiRest.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {


}
