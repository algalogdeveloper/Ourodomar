
package com.lrtservicos.ourodomar.service;

import com.lrtservicos.ourodomar.model.Profissao;
import com.lrtservicos.ourodomar.repository.ProfissaoRepository;
import java.util.LinkedHashSet;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProfissaoService {
    
    private ProfissaoRepository pr;
    
    public LinkedHashSet<Profissao> todasProfissoes(){
        return pr.todasProfissoes();
    }
    
     public LinkedHashSet<Profissao> buscarProfissoes(String param){
        return pr.buscar(param);
    }
     
      public Profissao pegarProfissao(String param){
        return pr.obter(param);
    }
    
}
