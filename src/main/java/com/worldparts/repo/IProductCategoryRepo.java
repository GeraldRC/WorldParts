package com.worldparts.repo;

import com.worldparts.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductCategoryRepo extends JpaRepository<ProductCategory, Integer> {

    @Query("from ProductCategory order by categoryName asc ")
    List<ProductCategory> listarCategoriasOrdenadas();
}
