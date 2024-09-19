package br.go.senac.ads4.service;

import br.go.senac.ads4.dto.AddressDto;
import br.go.senac.ads4.interfaces.IService;

import java.util.List;

public class AddressService implements IService<AddressDto, Integer> {
    @Override
    public AddressDto creat(AddressDto entity) {
        return null;
    }

    @Override
    public AddressDto read(Integer id) {
        return null;
    }

    @Override
    public List<AddressDto> read() {
        return List.of();
    }

    @Override
    public AddressDto update(Integer id, AddressDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
