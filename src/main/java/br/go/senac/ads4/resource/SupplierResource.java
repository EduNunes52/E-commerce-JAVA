package br.go.senac.ads4.resource;

import br.go.senac.ads4.dto.SupplierDto;
import br.go.senac.ads4.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping ( value = "/api/v1/Suppliers")
public class SupplierResource implements IResource<SupplierDto, Integer> {
    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public SupplierDto create(@RequestBody SupplierDto entity) {
        return null;
    }

    @Override
    @GetMapping (
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public SupplierDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping (
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<SupplierDto> get() {
        return List.of();
    }

    @Override
    @PutMapping (
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public SupplierDto update(
            @PathVariable Integer id,
            @RequestBody SupplierDto entity) {
        return null;
    }

    @Override
    @DeleteMapping (
            value = "/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}
