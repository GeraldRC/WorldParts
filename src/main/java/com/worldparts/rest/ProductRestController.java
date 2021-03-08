package com.worldparts.rest;

import com.worldparts.model.Product;
import com.worldparts.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    @Autowired
    private IProductService iProductService;

    private final  DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @GetMapping
    public ResponseEntity<List<Product>> listar(){
        return  new ResponseEntity<>(iProductService.listar(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> listarPorId(@PathVariable Integer id){
        Product product = iProductService.buscarPorId(id);
        if (product.getProductId() == null){
            Map<String,Object> error = new HashMap<>();
            error.put("date", LocalDateTime.now().format(FORMATTER));
            error.put("error",HttpStatus.NOT_FOUND);
            error.put("message","Producto no Encontrado: ID (" + id + ")");

           return new  ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product,HttpStatus.OK);

    }
}
