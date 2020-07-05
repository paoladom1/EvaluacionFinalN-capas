package com.uca.capas.service;

import com.uca.capas.domain.CatalogoMateria;
import com.uca.capas.repositories.CatalogoMateriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CatalogoMateriaServiceImpl implements CatalogoMateriaService {
    @Autowired
    CatalogoMateriaRepo catalogoMateriaRepo;
    @Override
    public List<CatalogoMateria> findAll() throws DataAccessException {
        return catalogoMateriaRepo.findAll();
    }

    //@Override
    //public void save(CatalogoMateria am) throws DataAccessException {
      //  return catalogoMateriaRepo.save(am);
   // }
}