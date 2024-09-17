package com.lrtservicos.ourodomar.repository.imp;

import com.lrtservicos.ourodomar.datasource.DataSourceConfig;
import com.lrtservicos.ourodomar.model.Associado;
import com.lrtservicos.ourodomar.repository.AssociadoRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AssociadoRepositoryImp implements AssociadoRepository {

    @Override
    public Connection getConnection() {
        return DataSourceConfig.newInstance().begin();
    }

    @Override
    public boolean save(Associado a) {
        try {
            Connection connection = getConnection();
            PreparedStatement prepareStatement = connection
                    .prepareStatement("insert into associado (nome,sexo,cpf,contato,email,rg,dtn,matricula,datadeFiliacao,regimedetrabalho,enderecosegurado,numero,bairro,cep,cidade,uf,pontoreferencia,confrontantesviz,idcategoria,idpropriedaderural,idprofissao,idassociacao,estadocivil,ctps_ct,apelido) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            prepareStatement.setObject(1, a.getNome());
            prepareStatement.setObject(2, a.getSexo());
            prepareStatement.setObject(3, a.getCpf());
            prepareStatement.setObject(4, a.getContato());
            prepareStatement.setObject(5, a.getEmail());
            prepareStatement.setObject(6, a.getRg());
            prepareStatement.setObject(7, a.getDtn());
            prepareStatement.setObject(8, a.getMatricula());
            prepareStatement.setObject(9, a.getDatadeFiliacao());
            prepareStatement.setObject(10, a.getRtb());
            prepareStatement.setObject(11, a.getEndereco().getEnderecoSegurado());
            prepareStatement.setObject(12, a.getEndereco().getNumero());
            prepareStatement.setObject(13, a.getEndereco().getBairro());
            prepareStatement.setObject(14, a.getEndereco().getCep());
            prepareStatement.setObject(15, a.getEndereco().getCidade());
            prepareStatement.setObject(16, a.getEndereco().getUF());
            prepareStatement.setObject(17, a.getEndereco().getPontoReferencia());
            prepareStatement.setObject(18, a.getEndereco().getConfrontantesVizinho());
            prepareStatement.setObject(19, a.getCategoria().getId());
            prepareStatement.setObject(20, a.getPr().getId());
            prepareStatement.setObject(21, a.getProfissao().getId());
            prepareStatement.setObject(22, a.getAssociacao().getId());
            prepareStatement.setObject(23, a.getEstadoCivil());
            prepareStatement.setObject(24, a.getCtps_ct());
            prepareStatement.setObject(25, a.getApelido());
            prepareStatement.execute();
            return true;
        } catch (SQLException e) {
            throw new UnsupportedOperationException("Nao foi possivel enviar dados:" + e);
        }
    }

    @Override
    public LinkedHashSet<Associado> todos() {
        Connection connection = getConnection();
        LinkedHashSet<Associado> associados = new LinkedHashSet<>();
        try {
            PreparedStatement prepareStatement = connection.prepareStatement("select * from associado;");
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                Associado a = new Associado();
                a.setId(rs.getLong("id"));
                a.setNome(rs.getString("nome"));
                a.setSexo(rs.getString("sexo"));
                a.setEmail(rs.getString("email"));
                a.setCpf(rs.getString("cpf"));
                a.setRg(rs.getString("rg"));
                a.setDtn(rs.getDate("dtn").toLocalDate());
                associados.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssociadoRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return associados;
    }

    @Override
    public boolean validarAssociado(String param) {
        Connection connection = getConnection();
        try {
            PreparedStatement prepareStatement = connection.prepareStatement("select * from associado a where a.cpf like ?");
            ResultSet rs = prepareStatement.executeQuery();
            Associado associado = null;
            if (rs.next()){
                associado = new Associado();
                associado.setId(rs.getLong("idassociado"));
                associado.setMatricula(rs.getString("matricula"));
            }
            return Objects.isNull(associado);
        } catch (SQLException e) {
            throw new UnsupportedOperationException("Associado nao enecontrado!"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        }
    }

}
