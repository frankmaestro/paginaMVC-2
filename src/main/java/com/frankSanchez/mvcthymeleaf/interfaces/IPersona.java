package com.frankSanchez.mvcthymeleaf.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frankSanchez.mvcthymeleaf.modelo.Persona;


@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
