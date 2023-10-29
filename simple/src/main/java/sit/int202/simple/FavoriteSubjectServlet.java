package sit.int202.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "FavoriteSubjectServlet", value = "/favoriteSubject")
public class FavoriteSubjectServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String[] subjects = request.getParameterValues("subjects");
        String browser = request.getHeader("User-Agent");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Your Favorite Subject</h1>");
        out.println("Student ID : " + id + "<br>");
        out.println("Student Name : " + name + "<br>");
        out.println("Favorite Subject :  <br>");
        for (String subject : subjects) {
            out.println("&nbsp&nbsp -" + subject + "<br>");
        }

        Map<String, String[]> params = request.getParameterMap();

        out.println("<h1>Requst Parameter from Map:: </h1><br>");
        out.println("----------------------------------<br>");
        out.println("Student ID : " + params.get("id")[0] + "<br>");
        out.println("Student Name : " + params.get("name")[0] + "<br>");
        out.println("Your Favorite Subject :  <br>");
        for (String subject : subjects) {
            out.println("&nbsp&nbsp -" + subject + "<br>");
        }

        out.println("<a href='favoriteSubject.html'>Back</a>");
        out.println("</body></html>");

    }

    }