package com.uca.capas.service;

import com.uca.capas.domain.Materia;
import com.uca.capas.repositories.MateriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    MateriaRepo materiaRepo;
    @Override
    public List<Materia> findAll() throws DataAccessException {
        return materiaRepo.findAll();
    }

    @Override
    public Materia findOne(Integer code) throws DataAccessException {
        return materiaRepo.findByCodMateria(code);
    }

    @Override
    @Transactional
    public void save(Materia materia) throws DataAccessException {
        materiaRepo.save(materia);
    }

    @Override
    @Transactional
    public void delete(Integer codMateria) throws DataAccessException {
        materiaRepo.deleteById(codMateria);
    }
}
