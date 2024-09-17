package com.lrtservicos.ourodomar.controller.subcontroller;

import com.lrtservicos.ourodomar.controller.Invoke;
import com.lrtservicos.ourodomar.model.Roule;
import com.lrtservicos.ourodomar.repository.imp.AssociadoRepositoryImp;
import com.lrtservicos.ourodomar.service.AssociadoService;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TodosAssociados implements Invoke {

    @Override
    public String invoke(HttpServletRequest request, HttpServletResponse response, Roule r) {
        AssociadoService as = new AssociadoService(new AssociadoRepositoryImp());
        String page = "home/painel";
        if (r.name().equals("Relatorios") || r.name().equals("Todas")) {
            Map<Object, Object> model = new HashMap<>();
            model.put("associados", as.buscartodosassociados());
            request.setAttribute("model", model);
            page = "associados/todos-associados";
        }
        return page;
    }

}
