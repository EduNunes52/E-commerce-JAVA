package br.go.senac.ads4.service;

import br.go.senac.ads4.dto.UserDto;
import br.go.senac.ads4.interfaces.IService;

import java.util.List;

public class UserService implements IService<UserDto, Integer> {
    @Override
    public UserDto creat(UserDto entity) {
        return null;
    }

    @Override
    public UserDto read(Integer id) {
        return null;
    }

    @Override
    public List<UserDto> read() {
        return List.of();
    }

    @Override
    public UserDto update(Integer id, UserDto entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
