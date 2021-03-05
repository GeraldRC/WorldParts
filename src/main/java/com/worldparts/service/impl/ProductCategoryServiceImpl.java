package com.worldparts.service.impl;

import com.worldparts.model.ProductCategory;
import com.worldparts.repo.IProductCategoryRepo;
import com.worldparts.service.IProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryServiceImpl implements IProductCategoryService {

    @Autowired
    private IProductCategoryRepo repo;

    @Override
    public List<ProductCategory> listar() {
        return repo.findAll();
    }

    @Override
    public ProductCategory buscarPorId(Integer id) {
        Optional<ProductCategory> op = repo.findById(id);
        return op.orElseGet(ProductCategory::new);
    }

    @Override
    public ProductCategory registrar(ProductCategory obj) {
        return repo.save(obj);
    }

    @Override
    public ProductCategory modificar(ProductCategory obj) {
        return repo.save(obj);
    }

    @Override
    public boolean eliminar(Integer id) {
        repo.deleteById(id);
        return true;
    }

    @Override
    public List<ProductCategory> listarCategoriasOrdenadas() {
        return repo.listarCategoriasOrdenadas();
    }
}
