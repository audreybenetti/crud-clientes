package br.edu.utfpr.clientes;

import br.edu.utfpr.cidade.Cidade;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
    private Integer codigo;
    private String nome;
    private Cidade cidade;

}
