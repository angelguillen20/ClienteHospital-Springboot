package com.Hospital.Cliente.HospitalCliente.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Cliente.HospitalCliente.Service.ClienteService;

@RestController
@RequestMapping("/api/v2/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
}
