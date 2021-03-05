package com.worldparts.repo;

import com.worldparts.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IInventoryRepo extends JpaRepository<Inventory, Integer> {

    @Query("from Inventory i where i.product.category.categoryId = :id and i.warehouse.warehouseId = :id2")
    List<Inventory> listarPorCategoriaAndWarehouse(@Param("id") Integer id,@Param("id2") Integer id2) ;

    @Query("from Inventory i where i.product.category.categoryId = :id")
    List<Inventory> listarPorCategoria(@Param("id") Integer id) ;

    @Query("from Inventory i where  i.warehouse.warehouseId = :id")
    List<Inventory> listarPorWarehouse(@Param("id") Integer id) ;
}
