package com.naat.proyectofutbol.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naat.proyectofutbol.entidades.TbCupon;

@Repository
public interface TbCuponRepository extends JpaRepository<TbCupon, String>{

}
