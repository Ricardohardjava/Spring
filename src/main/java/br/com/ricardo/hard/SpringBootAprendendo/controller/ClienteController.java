package br.com.ricardo.hard.SpringBootAprendendo.controller;

import br.com.ricardo.hard.SpringBootAprendendo.model.Cliente;
import br.com.ricardo.hard.SpringBootAprendendo.repository.ClienteRepository;
import jdk.jfr.Enabled;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


@Autowired
    private ClienteRepository clienteRepository;

@GetMapping
    public List<Cliente> listar() {
return clienteRepository.findAll();
    }
}
