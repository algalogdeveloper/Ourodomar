
package com.lrtservicos.ourodomar.repository;

import com.lrtservicos.ourodomar.model.Associado;
import java.sql.Connection;
import java.util.LinkedHashSet;

public interface AssociadoRepository {
    
    public boolean save(Associado associado);
    
    public LinkedHashSet<Associado> todos();
    
    public Connection getConnection();
    
    public boolean validarAssociado(String param);
}
