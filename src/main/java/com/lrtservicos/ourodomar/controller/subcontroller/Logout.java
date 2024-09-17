package com.lrtservicos.ourodomar.controller.subcontroller;

import com.lrtservicos.ourodomar.controller.Invoke;
import com.lrtservicos.ourodomar.model.Roule;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout implements Invoke {

    @Override
    public String invoke(HttpServletRequest request, HttpServletResponse response, Roule roule) {
        request.getSession().invalidate();
        request.setAttribute("message", "Sessao foi finalizada com sucesso!");
        return "/index";
    }

}
