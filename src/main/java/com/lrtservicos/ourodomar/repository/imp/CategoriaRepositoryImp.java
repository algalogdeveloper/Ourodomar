
package com.lrtservicos.ourodomar.repository.imp;

import com.lrtservicos.ourodomar.datasource.DataSourceConfig;
import com.lrtservicos.ourodomar.model.Categoria;
import com.lrtservicos.ourodomar.repository.CategoriaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class CategoriaRepositoryImp implements CategoriaRepository{

    @Override
    public LinkedList<Categoria> todasCategorias() {
        try {
            Connection c = getConnection();
            PreparedStatement ps = c.prepareStatement("select * from categoria");
            ResultSet rs = ps.executeQuery();
            LinkedList<Categoria> categorias = new LinkedList<>();
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setId(rs.getLong(1));
                categoria.setCategoria(rs.getString(2));
                categorias.add(categoria);
            }
            return categorias;
        } catch (SQLException e) {
                  throw new UnsupportedOperationException("Lista nao carregada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  
        }
    }

    @Override
    public Categoria obter(String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
     public Connection getConnection(){
         return DataSourceConfig.newInstance().begin();
     }
    
}
