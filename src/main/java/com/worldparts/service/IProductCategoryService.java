package com.worldparts.service;

import com.worldparts.model.ProductCategory;

import java.util.List;

public interface IProductCategoryService extends ICRUD<ProductCategory>{

    List<ProductCategory> listarCategoriasOrdenadas();
}
