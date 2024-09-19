package br.go.senac.ads4.resource;

import br.go.senac.ads4.dto.ShipperDto;
import br.go.senac.ads4.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping (value = "/api/v1/Shippers")
public class ShipperResource implements IResource<ShipperDto, Integer> {
    @Override
    @PostMapping (
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ShipperDto create(@RequestBody ShipperDto entity) {
        return null;
    }

    @Override
    @GetMapping (
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ShipperDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<ShipperDto> get() {
        return List.of();
    }

    @Override
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ShipperDto update(
            @PathVariable Integer id,
            @RequestBody ShipperDto entity) {
        return null;
    }

    @Override
    @DeleteMapping (
            value = "/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}
