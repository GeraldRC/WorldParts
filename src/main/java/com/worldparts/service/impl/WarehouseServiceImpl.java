package com.worldparts.service.impl;

import com.worldparts.model.Warehouse;
import com.worldparts.repo.IWarehouseRepo;
import com.worldparts.service.IWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WarehouseServiceImpl implements IWarehouseService {

    @Autowired
    private IWarehouseRepo repo;

    @Override
    public List<Warehouse> listar() {
        return repo.findAll();
    }

    @Override
    public Warehouse buscarPorId(Integer id) {
        Optional<Warehouse> op = repo.findById(id);
        return op.orElseGet(Warehouse::new);
    }

    @Override
    public Warehouse registrar(Warehouse obj) {
        return repo.save(obj);
    }

    @Override
    public Warehouse modificar(Warehouse obj) {
        return repo.save(obj);
    }

    @Override
    public boolean eliminar(Integer id) {
        repo.deleteById(id);
        return true;
    }

    @Override
    public List<Warehouse> listarWarehousesOrdenadas() {
        return repo.listarWarehouseOrdenadas();
    }
}
