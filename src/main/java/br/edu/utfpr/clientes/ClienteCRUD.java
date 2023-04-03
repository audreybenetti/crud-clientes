package br.edu.utfpr.clientes;

import br.edu.utfpr.cidade.Cidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteCRUD {
    private List<Cliente> clientes;

    public ClienteCRUD() {
        clientes = new ArrayList<>();
        create(new Cliente(1, "Audrey", new Cidade(1, "Maringá")));
        create(new Cliente(2, "Júlio", new Cidade(2,"Cornélio Procopio")));
        create(new Cliente(3, "Mariana", new Cidade(3, "Curitiba")));
    }

    public Cliente create(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> findAll(){
        return clientes;
    }

    public Optional<Cliente> getById(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == id) {
                return Optional.of(cliente);
            }
        }
        return Optional.empty();
    }

    public void update(int id, Cliente newCliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCodigo() == id) {
                clientes.set(i, newCliente);
                return;
            }
        }
    }

    public void delete(int id) {
        clientes.removeIf(cliente -> cliente.getCodigo() == id);
    }

    public boolean clienteExists(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == id) {
                return true;
            }
        }
        return false;
    }
}
