package br.edu.utfpr.cidade;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class CidadeService {

    private CidadeClient cidadeClient;
    private ArrayList<Cidade> cidades;

    public ArrayList<Cidade> findAll(){
        cidades.add(new Cidade(1, "Maringá"));
        return cidadeClient.findAll();
    }
}
