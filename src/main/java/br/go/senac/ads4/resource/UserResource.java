package br.go.senac.ads4.resource;

import br.go.senac.ads4.dto.UserDto;
import br.go.senac.ads4.interfaces.IResource;
import br.go.senac.ads4.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/users" )
public class UserResource implements IResource<UserDto, Integer> {

    @Autowired
    UserService userService;

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public UserDto create(@RequestBody UserDto entity) {
        log.info("UserResource::iniciado");
        log.debug("Valores: {}", entity);

        return userService.creat(entity);
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public UserDto get(@PathVariable Integer id) {
        log.info("UserResource::get(id)");
        log.debug("Valores: {}", id);

        return userService.read(id);
    }

    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<UserDto> get() {
        log.info("UserResource::get");
        log.debug("Valores: sem parâmetro");

        return userService.read();
    }

    @Override
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public UserDto update(
            @PathVariable Integer id,
            @RequestBody UserDto entity) {

        log.info("UserResource::update");
        log.debug("Valores: {} e {}", id, entity);

        return userService.update(id, entity);
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("UserResource::delete");
        log.debug("Valores: {}", id, id);

        userService.delete(id);
    }
}
