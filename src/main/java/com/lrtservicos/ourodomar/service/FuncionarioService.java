package com.lrtservicos.ourodomar.service;

import com.lrtservicos.ourodomar.model.Funcionario;
import com.lrtservicos.ourodomar.repository.FuncionarioRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class FuncionarioService {

    private FuncionarioRepository fr;

    public boolean solicitarAutorizacaoFuncionario(String login, String senha, String token) {
        return fr.autorizarFuncionario(login, senha, token);
    }
    
    public Funcionario obterFuncionario(String login, String senha) {
        return fr.obterFuncionario(login, senha);
    }
}
