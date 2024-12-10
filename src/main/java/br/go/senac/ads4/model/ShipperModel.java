package br.go.senac.ads4.model;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table
public class ShipperModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "NAME", length = 100, nullable = false)
    private String name;

    @Column (name = "DESCRIPTION", length = 500, columnDefinition = "TEXT")
    private String description;
}
