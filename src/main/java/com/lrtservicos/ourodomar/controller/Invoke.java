package com.lrtservicos.ourodomar.controller;

import com.lrtservicos.ourodomar.model.Roule;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Invoke {

    public String invoke(HttpServletRequest request, HttpServletResponse response, Roule roule);
}
