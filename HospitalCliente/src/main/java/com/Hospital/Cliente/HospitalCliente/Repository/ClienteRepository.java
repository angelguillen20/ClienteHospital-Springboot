package com.Hospital.Cliente.HospitalCliente.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Hospital.Cliente.HospitalCliente.model.Cliente;

@Repository
public class ClienteRepository {
    private List<Cliente> listaClientes = new ArrayList<>(); 
}
