
package com.lrtservicos.ourodomar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    private long id;
    private String nome;
    private String login;
    private String senha;
    private Roule roule;
    private String token;
}
