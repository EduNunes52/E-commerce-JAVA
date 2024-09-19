package br.go.senac.ads4.service;

import br.go.senac.ads4.dto.ShipperDto;
import br.go.senac.ads4.interfaces.IService;

import java.util.List;

public class ShipperService implements IService<ShipperDto,Integer> {
    @Override
    public ShipperDto creat(ShipperDto entity) {
        return null;
    }

    @Override
    public ShipperDto read(Integer id) {
        return null;
    }

    @Override
    public List<ShipperDto> read() {
        return List.of();
    }

    @Override
    public ShipperDto update(Integer id, ShipperDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
