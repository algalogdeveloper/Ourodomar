package com.lrtservicos.ourodomar.service;

import com.lrtservicos.ourodomar.model.Categoria;
import com.lrtservicos.ourodomar.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class CategoriaService {

    private CategoriaRepository cr;

    public Categoria obter(String param) {
        return cr.obter(param);
    }

}
