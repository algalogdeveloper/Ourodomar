package com.lrtservicos.ourodomar.repository.imp;

import com.lrtservicos.ourodomar.datasource.DataSourceConfig;
import com.lrtservicos.ourodomar.model.Funcionario;
import com.lrtservicos.ourodomar.model.Roule;
import com.lrtservicos.ourodomar.repository.FuncionarioRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class FuncionarioRepositoryImp implements FuncionarioRepository {

    @Override
    public boolean autorizarFuncionario(String login, String senha, String token) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("select * from funcionario f where f.login like ? and f.senha like ? and f.token like ? ");
            ps.setObject(1, login);
            ps.setObject(2, senha);
            ps.setObject(3, token);
            ResultSet rs = ps.executeQuery();
            Funcionario f = null;
            while (rs.next()) {
                f = new Funcionario();
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                f.setToken(rs.getString("token"));
            }
            return Objects.nonNull(f);
        } catch (SQLException e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    @Override
    public Funcionario obterFuncionario(String login, String senha) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("select * from funcionario f where f.login like ? and f.senha like ? ");
            ps.setObject(1, login);
            ps.setObject(2, senha);
            ResultSet rs = ps.executeQuery();
            Funcionario f = null;
            while (rs.next()) {
                f = new Funcionario();
                f.setId(rs.getLong("idfuncionario"));
                f.setNome(rs.getString("nome_funcionario"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                f.setToken(rs.getString("token"));
                f.setRoule(Roule.valueOf(rs.getString("roule")));
            }
            return f;
        } catch (SQLException e) {
            throw new UnsupportedOperationException("Erro:"+e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    @Override
    public Connection getConnection() {
        return DataSourceConfig.newInstance().begin();
    }
    
   

}

