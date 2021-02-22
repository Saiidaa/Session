package com.company;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

    protected void doD(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("out")){
                    System.out.println("out="+cookie.getValue());
                    break;
                }
            }
        }

        HttpSession session = request.getSession(false);
        System.out.println("User="+session.getAttribute("user"));
        if(session != null){
            session.invalidate();
        }
        response.sendRedirect("login.html");
    }

}