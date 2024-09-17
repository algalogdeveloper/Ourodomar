package com.lrtservicos.ourodomar.controller;

import com.lrtservicos.ourodomar.model.Funcionario;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {

    protected String location = "/WEB-INF/jsp/";
    protected String suffix = ".jsp";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            HashMap<Object, Object> session = (HashMap<Object, Object>) req.getSession().getAttribute("sessionmap");
            if (Objects.nonNull(session)) {
                Class entity = Class.forName("com.lrtservicos.ourodomar.controller.subcontroller." + req.getParameter("invoke"));
                Invoke mvc = (Invoke) entity.newInstance();
                Funcionario get = (Funcionario) session.get("funcionario");
                String pagina = mvc.invoke(req, resp, get.getRoule());
                RequestDispatcher dispatcher = req.getRequestDispatcher(location + pagina + suffix);
                dispatcher.forward(req, resp);
            } else {
                req.setAttribute("erro", "Login ou senha invalidos!");
                RequestDispatcher dispatcher = req.getRequestDispatcher(location + "index" + suffix);
                dispatcher.forward(req, resp);
            }
            
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | ServletException e) {
            throw new IllegalArgumentException("Nao e possivel executar açao: " + e);
        }

    }

}
