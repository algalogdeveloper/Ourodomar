package com.lrtservicos.ourodomar.repository.imp;

import com.lrtservicos.ourodomar.datasource.DataSourceConfig;
import com.lrtservicos.ourodomar.model.Profissao;
import com.lrtservicos.ourodomar.repository.ProfissaoRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;

public class ProfissaoRepositoryImp implements ProfissaoRepository {

    @Override
    public LinkedHashSet<Profissao> todasProfissoes() {
        try {
            LinkedHashSet<Profissao> todas = new LinkedHashSet<>();
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from profissao p");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Profissao p = new Profissao(rs.getLong(1), rs.getString(2));
                todas.add(p);
            }
            return todas;
        } catch (SQLException e) {
            throw new UnsupportedOperationException("Nao foi possivel carregar a lista:" + e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        }
    }

    @Override
    public LinkedHashSet<Profissao> buscar(String parem) {
    try {
            LinkedHashSet<Profissao> todas = new LinkedHashSet<>();
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from profissao p where profissao_nome like ?");
            ps.setObject(1, "%"+parem+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Profissao p = new Profissao(rs.getLong(1), rs.getString(2));
                todas.add(p);
            }
            return todas;
        } catch (SQLException e) {
            throw new UnsupportedOperationException("Nao foi possivel carregar a lista:" + e);

        }
    }

    @Override
    public Profissao obter(String parem) {
    try {
           Profissao p = null;
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from profissao p where profissao_nome like ?");
            ps.setObject(1, "%"+parem+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 p = new Profissao(rs.getLong(1), rs.getString(2));
            }
            return p;
        } catch (SQLException e) {
            throw new UnsupportedOperationException("Nao foi possivel buscar a profissao:" + e); 

        }
    }

    @Override
    public Connection getConnection() {
        return DataSourceConfig.newInstance().begin();
    }

}
