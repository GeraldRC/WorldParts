package com.worldparts.controllers;

import com.worldparts.service.IInventoryService;
import com.worldparts.service.IProductCategoryService;
import com.worldparts.service.IWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MonitorController {

    @Autowired
    private IInventoryService serviceInventory;

    @Autowired
    private IWarehouseService serviceWarehouse;

    @Autowired
    private IProductCategoryService serviceCategory;

    @GetMapping("/monitor")
    public String monitor(Model model){
        model.addAttribute("inventories",serviceInventory.listar());
        model.addAttribute("warehouses",serviceWarehouse.listarWarehousesOrdenadas());
        model.addAttribute("categories",serviceCategory.listarCategoriasOrdenadas());
        model.addAttribute("titulo","Monitor de Productos");
        return "monitor";
    }

    @GetMapping("/monitor/filter")
    public String filter(Model model, @RequestParam Integer category, @RequestParam Integer warehouse){

        if (category == 0 && warehouse == 0){
            model.addAttribute("inventories",serviceInventory.listar());
        }else if(category != 0 && warehouse == 0){
            model.addAttribute("inventories",serviceInventory.listarPorCategoria(category));
        }else if(warehouse !=0 && category == 0){
            model.addAttribute("inventories",serviceInventory.listarPorWarehouse(warehouse));
        }else{
            model.addAttribute("inventories",serviceInventory.listarPorCategoriaAndWarehouse(category,warehouse));
        }

        model.addAttribute("warehouses",serviceWarehouse.listarWarehousesOrdenadas());
        model.addAttribute("categories",serviceCategory.listarCategoriasOrdenadas());
        model.addAttribute("titulo","Monitor de Productos");
        return "monitor";
    }
}
