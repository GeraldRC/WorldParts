package com.worldparts.service.impl;

import com.worldparts.model.Inventory;
import com.worldparts.repo.IInventoryRepo;
import com.worldparts.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl  implements IInventoryService {

    @Autowired
    private IInventoryRepo repo;


    @Override
    public List<Inventory> listar() {
        return repo.findAll();
    }

    @Override
    public List<Inventory> listarPorCategoriaAndWarehouse(Integer id, Integer id2) {
        return repo.listarPorCategoriaAndWarehouse(id, id2);
    }

    @Override
    public List<Inventory> listarPorCategoria(Integer id) {
        return repo.listarPorCategoria(id);
    }

    @Override
    public List<Inventory> listarPorWarehouse(Integer id) {
        return repo.listarPorWarehouse(id);
    }
}
