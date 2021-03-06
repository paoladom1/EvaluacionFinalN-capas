package com.uca.capas.services;

import com.uca.capas.domain.Municipio;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface MunicipioService {
    public List<Municipio> findAll() throws DataAccessException;
}
