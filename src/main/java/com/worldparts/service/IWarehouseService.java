package com.worldparts.service;

import com.worldparts.model.Warehouse;

import java.util.List;

public interface IWarehouseService extends ICRUD<Warehouse>{

    List<Warehouse> listarWarehousesOrdenadas();
}
