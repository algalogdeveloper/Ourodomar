package com.lrtservicos.ourodomar.controller;

import com.lrtservicos.ourodomar.migration.CreateDataSourceMigration;
import com.lrtservicos.ourodomar.model.Funcionario;
import com.lrtservicos.ourodomar.repository.imp.FuncionarioRepositoryImp;
import com.lrtservicos.ourodomar.service.FuncionarioService;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Authenticar extends HttpServlet {

    protected String suffix = ".jsp";
    protected String location = "/WEB-INF/jsp/";
    protected String page = "";
    protected FuncionarioService service;

    public Authenticar() {
        try {
            CreateDataSourceMigration.createJdbcMigration();
            service = new FuncionarioService(new FuncionarioRepositoryImp());
        } catch (Exception e) {
            throw new IllegalArgumentException("Tabelas nao foram criadas: " + e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        HashMap<Object, Object> sessionMap = (HashMap<Object, Object>) request
                .getSession()
                .getAttribute("sessionmap");
        if (Objects.isNull(sessionMap)) {
            String login = request.getParameter("email");
            String senha = request.getParameter("pswd");
            boolean solicitarAutorizacaoFuncionario = service
                    .solicitarAutorizacaoFuncionario(login, senha, "03380666599");
            if (solicitarAutorizacaoFuncionario) {
                Funcionario funcionario = service.obterFuncionario(login, senha);
                sessionMap = new HashMap<>();
                sessionMap.put("login", funcionario.getLogin());
                sessionMap.put("token", funcionario.getToken());
                sessionMap.put("dataacesso", LocalDate.now());
                sessionMap.put("funcionario", funcionario);
                session.setAttribute("sessionmap", sessionMap);
                System.out.println("Acesso autorizado ...");
                page = "controller?invoke=Home";
                response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
                response.setHeader("Location", page);
            } else {
                request.setAttribute("erro", "Login ou senha invalidos!");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            request.setAttribute("message", "Voce ainda esta logado");
            page = "controller?invoke=Home";
            response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
            response.setHeader("Location", page);
        }

    }

}
