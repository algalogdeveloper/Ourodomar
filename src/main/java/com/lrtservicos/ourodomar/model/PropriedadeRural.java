package com.lrtservicos.ourodomar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropriedadeRural {

    private long id;
    private String nome_propriedade;
    private Endereco endereco;
    private Categoria categoria;

}
