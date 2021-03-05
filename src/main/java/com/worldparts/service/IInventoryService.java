package com.worldparts.service;

import com.worldparts.model.Inventory;


import java.util.List;

public interface IInventoryService {

    List<Inventory> listar();
    List<Inventory> listarPorCategoriaAndWarehouse(Integer id,Integer id2) ;
    List<Inventory> listarPorCategoria(Integer id) ;
    List<Inventory> listarPorWarehouse(Integer id) ;
}
