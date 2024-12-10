package br.go.senac.ads4.service;

import br.go.senac.ads4.Mapper.ShipperMapper;
import br.go.senac.ads4.dto.ShipperDto;
import br.go.senac.ads4.interfaces.IService;
import br.go.senac.ads4.model.ShipperModel;
import br.go.senac.ads4.repository.ShipperRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShipperService implements IService<ShipperDto, Integer>{

    final ShipperRepository shipperRepository;
    final ShipperMapper shipperMapper;

    public ShipperService(ShipperRepository shipperRepository, ShipperMapper shipperMapper) {
        this.shipperRepository = shipperRepository;
        this.shipperMapper = shipperMapper;
    }

    @Override
    public ShipperDto creat(ShipperDto dto) {
        log.info("ShipperService::create");

        ShipperModel shipperModel = shipperMapper.toModel(dto);//aqui converte

        ShipperModel shipperModelGravado = shipperRepository.save(shipperModel);// aqui grava no banco de dados

        ShipperDto shipperDto = shipperMapper.toDto(shipperModelGravado);//aqui converte para camada adjacente

        return shipperDto;//retorna objeto preenchido.
    }

    @Override
    public ShipperDto read(Integer id) {
        log.info("ShipperService::read(id)");

        ShipperModel shipperPesquisado = shipperRepository.findById(id).orElseThrow(() -> new RuntimeException("id pesquisado não existe:{}"));

        ShipperDto shipperDto = shipperMapper.toDto(shipperPesquisado);//aqui converte para camada adjacente

        return shipperDto;//retorna objeto preenchido.

    }

    @Override
    public List<ShipperDto> read() {
        log.info("ShipperService::read()");

        List<ShipperModel> shipperModelList = shipperRepository.findAll();

        return  shipperMapper.toDtoList(shipperModelList);

    }

    @Override
    public ShipperDto update(Integer id, ShipperDto entity) {
        log.info("ShipperService::update(id,entity");

        ShipperModel shipperPesquisado = shipperRepository.findById(id).orElseThrow(() -> new RuntimeException("id pesquisado não existe:{}"));

        shipperPesquisado.setName(entity.getName());
        shipperPesquisado.setDescription(entity.getDescription());

        ShipperModel shipperAtualizado = shipperRepository.save(shipperPesquisado);

        ShipperDto shipperDto = shipperMapper.toDto(shipperPesquisado);//aqui converte para camada adjacente

        return shipperDto;
    }

    @Override
    public void delete(Integer id) {
        log.info("ShipperService::delete(id)");

        shipperRepository.deleteById(id);
    }
}
