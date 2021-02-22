package com.company;

import java.io.IOException;
import java.net.http.HttpRequest;

@WebServlet("/ServletIn")
public class ServletIn extends HttpServlet {
    private final String id = "Saidochka";
    private final String password = "saida";
    protected void doD(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         String user = request.getParameter("user");
         String password = request.getParameter("password");


         if (id.equals(user) && password.equals(password)){
             HttpSession session = request.getSession();
             session.setAttribute("user", "Saidochka");


         }



    }

}
