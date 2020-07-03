package com.uca.capas.service;

import com.uca.capas.domain.Institucion;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface InstitucionService {
    public List<Institucion> findAll() throws DataAccessException;

    public List<Institucion> findByMunicipio(Integer id) throws DataAccessException;
}