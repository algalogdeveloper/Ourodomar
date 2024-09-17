
package com.lrtservicos.ourodomar.repository.imp;

import com.lrtservicos.ourodomar.datasource.DataSourceConfig;
import com.lrtservicos.ourodomar.model.Associacao;
import com.lrtservicos.ourodomar.repository.AssociacaoRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;

public class AssociacaoRepositoryImp implements AssociacaoRepository{

    @Override
    public Connection getConnection() {
       return DataSourceConfig.newInstance().begin(); 
    }

    @Override
    public boolean merge(Associacao a) {
        try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("insert into associacao values ()");
            ps.setObject(1, a.getNome());
            ps.setObject(2, a.getEndereco());
            ps.setObject(3, a.getCnpj());
         ps.executeUpdate();
         return true;
        } catch (SQLException e) {
             throw new UnsupportedOperationException("Nao possivel realizar operaçao."); 
        }
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinkedList<Associacao> todas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinkedList<Associacao> buscar(String dado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Associacao a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Associacao editar(Associacao a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
