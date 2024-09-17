
package com.lrtservicos.ourodomar.controller.subcontroller;

import com.lrtservicos.ourodomar.controller.Invoke;
import com.lrtservicos.ourodomar.model.Roule;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormAssociado implements Invoke{

    @Override
    public String invoke(HttpServletRequest request, HttpServletResponse response, Roule r) {
       String page = "home/painel";
       if(r.name().equals("Cadastros") || r.name().equals("Todas")){
           page = "associados/form-associado";
       }
        return page;
    }
    
}
