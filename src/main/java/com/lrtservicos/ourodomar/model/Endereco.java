
package com.lrtservicos.ourodomar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    
    private String enderecoSegurado;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String UF;
    private String pontoReferencia;
    private String confrontantesVizinho;
}
