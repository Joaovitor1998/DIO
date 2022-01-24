package com.joaovitor.padroes.projeto.spring.controller;

import com.joaovitor.padroes.projeto.spring.model.Client;
import com.joaovitor.padroes.projeto.spring.service.ClientServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientRestController {

    @Autowired
    ClientServiceImpl clientService;

    @GetMapping
    public Iterable<Client> getAllClients() {
        return clientService.searchAll();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.searchById(id);
    }

    @PostMapping
    public void saveClient(@RequestBody Client client) {
        clientService.insert(client);
    }

    @PutMapping("/{id}")
    public void updateClient(@PathVariable Long id, @RequestBody Client client) {
        clientService.update(id, client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.delete(id);
    }
}
