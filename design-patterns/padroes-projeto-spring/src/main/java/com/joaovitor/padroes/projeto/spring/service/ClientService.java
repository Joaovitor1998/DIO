package com.joaovitor.padroes.projeto.spring.service;

import com.joaovitor.padroes.projeto.spring.model.Client;

public interface ClientService {

    Iterable<Client> searchAll();

    Client searchById(Long id);

    void insert(Client client);

    void update(Long id, Client client);

    void delete(Long id);
}
