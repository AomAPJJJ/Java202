package sit.int202.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.simple.entities.Subject;
import sit.int202.simple.repositories.SubjectRepository;


import java.io.IOException;
import java.util.List;

@WebServlet(name = "MultiplicationServlet", value = "/multiplication_table")
public class MultiplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberStr = request.getParameter("number");
        if(numberStr == null || numberStr.length() == 0 || !isNumber(numberStr)){
            request.setAttribute("error" , "Invalid number or parameter !!!!");
        }

        request.getRequestDispatcher("/multiplication_table.jsp").forward(request, response);
    }

    private static boolean isNumber(String nStr) {
        for(int i = 0; i < nStr.length(); i++){
            if(! Character.isDigit(nStr.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}