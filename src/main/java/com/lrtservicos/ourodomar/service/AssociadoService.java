package com.lrtservicos.ourodomar.service;

import com.lrtservicos.ourodomar.model.Associado;
import com.lrtservicos.ourodomar.repository.AssociadoRepository;
import java.util.LinkedHashSet;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AssociadoService {

    protected AssociadoRepository ar;

    public LinkedHashSet<Associado> buscartodosassociados() {
        return ar.todos();
    }

    public boolean cadastrarAssociado(Associado associado) {
        boolean enviar = false;
        if(ar.validarAssociado(associado.getCpf())){
            enviar = ar.save(associado);
        }
        return enviar;
    }
}
