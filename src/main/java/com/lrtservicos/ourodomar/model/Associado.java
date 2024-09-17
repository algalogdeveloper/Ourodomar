
package com.lrtservicos.ourodomar.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Associado {
    private long id;
    private String nome;
    private String apelido;
    private String estadoCivil;
    private String ctps_ct;
    private String sexo;
    private String cpf;
    private String contato;
    private String email;
    private String rg;
    private LocalDate dtn;
    private String matricula;
    private LocalDate datadeFiliacao;
    private Categoria categoria;
    private PropriedadeRural pr;
    private Profissao profissao;
    private RegimedeTrabalho rtb;
    private Associacao associacao;
    private Endereco endereco;
  
 
}
