package com.worldparts.service.impl;


import com.worldparts.model.Product;
import com.worldparts.repo.IProductRepo;
import com.worldparts.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepo repo;

    @Override
    public List<Product> listar() {
        return repo.findAll();
    }

    @Override
    public Product buscarPorId(Integer id) {
        Optional<Product> op = repo.findById(id);
        return op.orElseGet(Product::new);
    }

    @Override
    public Product registrar(Product obj) {
        return repo.save(obj);
    }

    @Override
    public Product modificar(Product obj) {
        return repo.save(obj);
    }

    @Override
    public boolean eliminar(Integer id) {
        repo.deleteById(id);
        return true;
    }
}
