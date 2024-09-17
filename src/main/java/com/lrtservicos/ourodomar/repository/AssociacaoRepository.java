package com.lrtservicos.ourodomar.repository;

import com.lrtservicos.ourodomar.model.Associacao;
import java.sql.Connection;
import java.util.LinkedList;

public interface AssociacaoRepository {

    public boolean merge(Associacao a);

    public LinkedList<Associacao> todas();

    public LinkedList<Associacao> buscar(String dado);

    public void remove(Associacao a);
    
    public Associacao editar(Associacao a);
    
    public Connection getConnection();
    
    
}
