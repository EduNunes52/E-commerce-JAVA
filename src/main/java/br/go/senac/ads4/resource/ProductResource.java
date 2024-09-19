package br.go.senac.ads4.resource;

import br.go.senac.ads4.dto.ProductDto;
import br.go.senac.ads4.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping (value = "/api/v1/Products")
public class ProductResource implements IResource<ProductDto, Integer> {
    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProductDto create(@RequestBody ProductDto entity) {
        return null;
    }

    @Override
    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProductDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping (
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<ProductDto> get() {
        return List.of();
    }

    @Override
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProductDto update(
            @PathVariable Integer id,
            @RequestBody ProductDto entity) {
        return null;
    }

    @Override
    @DeleteMapping (
            value = "/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}
