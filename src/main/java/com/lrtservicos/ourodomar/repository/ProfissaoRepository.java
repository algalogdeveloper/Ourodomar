package com.lrtservicos.ourodomar.repository;

import com.lrtservicos.ourodomar.model.Profissao;
import java.sql.Connection;
import java.util.LinkedHashSet;

public interface ProfissaoRepository {

    public LinkedHashSet<Profissao> todasProfissoes();

    public LinkedHashSet<Profissao> buscar(String parem);

    public Profissao obter(String nome);
    
    public Connection getConnection();

}
