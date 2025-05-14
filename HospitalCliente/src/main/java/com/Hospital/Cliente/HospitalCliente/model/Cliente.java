package com.Hospital.Cliente.HospitalCliente.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String rol; 
    private int rut;
    private String nombreCliente;
    private Date fechaNacimientocliente; 

}
