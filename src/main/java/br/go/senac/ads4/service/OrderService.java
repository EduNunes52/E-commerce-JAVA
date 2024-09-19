package br.go.senac.ads4.service;

import br.go.senac.ads4.dto.OrderDto;
import br.go.senac.ads4.interfaces.IService;

import java.util.List;

public class OrderService implements IService<OrderDto, Integer> {
    @Override
    public OrderDto creat(OrderDto entity) {
        return null;
    }

    @Override
    public OrderDto read(Integer id) {
        return null;
    }

    @Override
    public List<OrderDto> read() {
        return List.of();
    }

    @Override
    public OrderDto update(Integer id, OrderDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
