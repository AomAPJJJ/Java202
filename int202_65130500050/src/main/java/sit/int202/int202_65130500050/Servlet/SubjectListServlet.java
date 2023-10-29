package sit.int202.int202_65130500050.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.int202_65130500050.Model.Subject;
import sit.int202.int202_65130500050.Model.SubjectReposity;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SubjectListServlet", value = "/subject-list")
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SubjectReposity subjectReposity = new SubjectReposity();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2> Subject List :: </h2><hr>");
        for(Subject subject  : subjectReposity.findAll()){

            out.println(subject.getId());

            out.println("");

            out.println(subject.getTitle());

            out.println("");

            out.println(subject.getCredit());



        }
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}