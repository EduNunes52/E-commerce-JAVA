package br.go.senac.ads4.repository;

import br.go.senac.ads4.model.ShipperModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipperRepository extends JpaRepository<ShipperModel, Integer> {
}
