package br.edu.utfpr.clientes;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(path = "/clientes")
@RestController
public class ClienteRest {

    private final ClienteCRUD crud;

    @PostMapping
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente){
        return ResponseEntity.ok(crud.create(cliente));
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes(){
        return ResponseEntity.ok(crud.findAll());
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable("codigo") Integer id){
        return crud.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<Void> atualizarCliente(@PathVariable("aplicacao") Integer id,
                                                                 @RequestBody Cliente cliente){
        if (crud.clienteExists(id)) {
            crud.update(id, cliente);
            return ResponseEntity.ok().build();
        } else return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> excluirCliente(@PathVariable("codigo") Integer id){
        if (crud.clienteExists(id)) {
            crud.delete(id);
            return ResponseEntity.ok().build();
        } else return ResponseEntity.notFound().build();
    }
}