package sit.int202.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.awt.Color.red;
import static java.lang.System.out;

@WebServlet(name = "GradeServlet", value = "/GradeServlet")
public class GradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String score = request.getParameter("score");
        int scoreValue = Integer.valueOf(score);
        String Grade = "F";
        String color = "green";

        if (scoreValue >= 80) {
            Grade = "A";
        } else if (scoreValue >= 75) {
            Grade = "B+";
        } else if (scoreValue >= 70) {
            Grade = "B";
        } else if (scoreValue >= 65) {
            Grade = "C+";
        } else if (scoreValue >= 60) {
            Grade = "C";
        } else if (scoreValue >= 55) {
            Grade = "D+";
        } else if (scoreValue >= 50) {
            Grade = "D";
        } else {
//           color = red;red
        }

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Simple Calculate Grade Servlet:: </h1><br>");
        out.println("Your score is " + score + " <br>");
        out.println("Your grade is <h1 style='color:" + color + "'>" + Grade + "</h1><br>");
        out.println("</body></html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

