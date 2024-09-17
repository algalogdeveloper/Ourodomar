
package com.lrtservicos.ourodomar.repository;

import com.lrtservicos.ourodomar.model.Categoria;
import java.sql.Connection;
import java.util.LinkedList;

public interface CategoriaRepository {
    
    public LinkedList<Categoria> todasCategorias ();
    
    public Categoria obter (String param);
    
     public Connection getConnection();
    
}
