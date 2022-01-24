package com.joaovitor.padroes.projeto.spring.service;

import java.util.Optional;

import com.joaovitor.padroes.projeto.spring.model.Address;
import com.joaovitor.padroes.projeto.spring.model.Client;
import com.joaovitor.padroes.projeto.spring.repository.AddressRepository;
import com.joaovitor.padroes.projeto.spring.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ViaCepService viaCepService;

    @Override
    public Iterable<Client> searchAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client searchById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void insert(Client client) {
        saveClientWithCep(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientById = clientRepository.findById(id);
        if (clientById.isPresent()) {
            saveClientWithCep(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void saveClientWithCep(Client client) {
        String cep = client.getAddress().getCep();
        Address address = addressRepository.findById(cep).orElseGet(() -> {
            Address newAddress = viaCepService.consultarCep(cep);
            addressRepository.save(newAddress);
            return newAddress;
        });

        client.setAddress(address);
        clientRepository.save(client);
    }

}
