package br.edu.utfpr.cidade;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@AllArgsConstructor
@RequestMapping(path = "/cidades")
@RestController
public class CidadeRest {

    private CidadeService service;

    @GetMapping
    public ResponseEntity<ArrayList<Cidade>> listarCidades(){
        return ResponseEntity.ok(service.findAll());
    }
}
