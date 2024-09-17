package com.lrtservicos.ourodomar.controller.subcontroller;

import com.lrtservicos.ourodomar.controller.Invoke;
import com.lrtservicos.ourodomar.model.Roule;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormAssociacao implements Invoke {

    @Override
    public String invoke(HttpServletRequest request, HttpServletResponse response, Roule roule) {
        String page = "home/painel";
        if(roule.name().equals("Cadastros") || roule.name().equals("Todas")){
            page = "associacao/form";
        }
        return page;
    }

}
