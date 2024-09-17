
package com.lrtservicos.ourodomar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Associacao {
    private long id;
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private String numero_sindicato;
    
}
