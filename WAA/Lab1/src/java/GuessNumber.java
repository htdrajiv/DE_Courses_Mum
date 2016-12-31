/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rajiv
 */
@WebServlet(urlPatterns = {"/GuessNumber"})
public class GuessNumber extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /* TODO output your page here. You may use following sample code. */
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String userAnswer = request.getParameter("answer");            
            Random random = new Random();
            int toCheck = random.nextInt(100);
            if(userAnswer==null || userAnswer.isEmpty()){
                writeContent(out);
            }else {
                int uAnswer = Integer.parseInt(userAnswer);
                if(uAnswer==toCheck){
                    out.println(toCheck+" :: Correct, Congratulations!");
                    writeContent(out);
                }else if(uAnswer>toCheck){
                    out.println(toCheck+" :: Too high, try again!");
                    writeContent(out);
                }else{
                    out.println(toCheck+" :: Too low, try again!");
                    writeContent(out);
                }
            }
        }
    }
    
    public void writeContent(PrintWriter out){
        out.println("<html>");
        out.println("<body>");
        out.println("<form method=GET action=GuessNumber>");
        out.println("Enter your guess number.<br> <input type=text name=answer> <br> <br>");
        out.println("<input type=submit value='Check Your Answer'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
