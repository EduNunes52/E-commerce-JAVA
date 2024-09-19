package br.go.senac.ads4.service;

import br.go.senac.ads4.dto.SupplierDto;
import br.go.senac.ads4.interfaces.IService;

import java.util.List;

public class SupplierService implements IService<SupplierDto, Integer> {
    @Override
    public SupplierDto creat(SupplierDto entity) {
        return null;
    }

    @Override
    public SupplierDto read(Integer id) {
        return null;
    }

    @Override
    public List<SupplierDto> read() {
        return List.of();
    }

    @Override
    public SupplierDto update(Integer id, SupplierDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
