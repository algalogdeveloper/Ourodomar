package com.lrtservicos.ourodomar.repository;

import com.lrtservicos.ourodomar.model.Funcionario;
import java.sql.Connection;

public interface FuncionarioRepository {

    public boolean autorizarFuncionario(String login, String senha, String token);

    public Funcionario obterFuncionario(String login, String senha);
    
      public Connection getConnection();
}
