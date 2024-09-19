package br.go.senac.ads4.service;

import br.go.senac.ads4.dto.ProductDto;
import br.go.senac.ads4.interfaces.IService;

import java.util.List;

public class ProductService implements IService<ProductDto, Integer> {
    @Override
    public ProductDto creat(ProductDto entity) {
        return null;
    }

    @Override
    public ProductDto read(Integer id) {
        return null;
    }

    @Override
    public List<ProductDto> read() {
        return List.of();
    }

    @Override
    public ProductDto update(Integer id, ProductDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
