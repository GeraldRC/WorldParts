package com.worldparts.repo;

import com.worldparts.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWarehouseRepo extends JpaRepository<Warehouse, Integer> {

    @Query("from Warehouse order by warehouseName asc ")
    List<Warehouse> listarWarehouseOrdenadas();
}
