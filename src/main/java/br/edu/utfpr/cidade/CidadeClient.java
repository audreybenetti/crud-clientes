package br.edu.utfpr.cidade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@FeignClient(url = "http://overleaf.cp.utfpr.edu.br/RCidades/resources", name = "cidade")
public interface CidadeClient {

    @GetMapping("/cidades")
    ArrayList<Cidade> findAll();

}
