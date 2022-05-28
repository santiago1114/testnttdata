package com.ingcsbenitez.testnttdata.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "telefono")
    private Long telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "ciudad_residencia")
    private String ciudadResidencia;

    @Column(name = "numero_documento", nullable = false, unique = true)
    private Long numeroDocumento;

    @Column(name = "tipo_documento", nullable = false)
    private Character tipoDocumento;

    public Usuario() {
    }

    public Usuario(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Long telefono, String direccion, String ciudadResidencia, Long numeroDocumento, Character tipoDocumento) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
    }
}