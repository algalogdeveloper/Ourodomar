package com.lrtservicos.ourodomar.controller.subcontroller;

import com.lrtservicos.ourodomar.controller.Invoke;
import com.lrtservicos.ourodomar.model.Associado;
import com.lrtservicos.ourodomar.model.Endereco;
import com.lrtservicos.ourodomar.model.RegimedeTrabalho;
import com.lrtservicos.ourodomar.model.Roule;
import com.lrtservicos.ourodomar.repository.imp.AssociadoRepositoryImp;
import com.lrtservicos.ourodomar.repository.imp.CategoriaRepositoryImp;
import com.lrtservicos.ourodomar.repository.imp.ProfissaoRepositoryImp;
import com.lrtservicos.ourodomar.service.AssociadoService;
import com.lrtservicos.ourodomar.service.CategoriaService;
import com.lrtservicos.ourodomar.service.ProfissaoService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EnviarAssociado implements Invoke {
    
    protected AssociadoService as = new AssociadoService(new AssociadoRepositoryImp());
    protected ProfissaoService ps = new ProfissaoService(new ProfissaoRepositoryImp());
    protected CategoriaService cs = new CategoriaService(new CategoriaRepositoryImp());
    private String messege;
    private String erro;
    
    @Override
    public String invoke(HttpServletRequest request, HttpServletResponse response, Roule r) {
        String page = "home/painel";
        if (r.name().equals("Cadastros") || r.name().equals("Todas")) {
            Map<Object, Object> model = new HashMap<>();
            
            Associado a = new Associado();
            a.setNome(request.getParameter("nome_associado"));
            a.setSexo(request.getParameter("sexo"));
            a.setContato(request.getParameter("contato"));
            a.setEmail(request.getParameter("email"));
            a.setDtn((LocalDate) DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(request.getParameter("dtn")));
            a.setDatadeFiliacao((LocalDate) DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(request.getParameter("dtFiliacao")));
            a.setCpf(request.getParameter("cpf"));
            a.setRg(request.getParameter("rg"));
            a.setEstadoCivil(request.getParameter("estadocivil"));
            a.setCtps_ct(request.getParameter("ctps_ct"));
            a.setApelido(request.getParameter("apelido"));
            a.setRtb(RegimedeTrabalho.valueOf(request.getParameter("rdt")));
            // a.setPr(pr);
            a.setProfissao(ps.pegarProfissao(request.getParameter("idprofissao")));
            a.setCategoria(cs.obter(request.getParameter("idcategoria")));
            a.setMatricula(request.getParameter("matricula"));
            Endereco e = new Endereco();
            e.setBairro(request.getParameter("bairro"));
            e.setCep(request.getParameter("cep"));
            e.setCidade(request.getParameter("cidade"));
            e.setEnderecoSegurado(request.getParameter("endereco"));
            e.setConfrontantesVizinho(request.getParameter("cfv"));
            e.setPontoReferencia(request.getParameter("pr"));
            e.setNumero(request.getParameter("numero"));
            e.setUF(request.getParameter("uf"));
            
            a.setEndereco(e);
            
            if (as.cadastrarAssociado(a)) {
                messege = "Enviando dados do associado!";
            } else {
                erro = "Associado ja possui cadastro!";
            }
            model.put("message", messege);
            model.put("erro", erro);
            model.put("associados", as.buscartodosassociados());
            request.setAttribute("model", model);
            page = "associados/todos-associados";
        }
        return page;
    }
    
}
