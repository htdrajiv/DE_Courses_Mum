/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import names.Person;

/**
 *
 * @author Rajiv
 */
@WebServlet(urlPatterns = {"/AllNamesServlet"})
public class AllNamesServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            /* TODO output your page here. You may use following sample code. */
            writeContent(out,(List<Person>)session.getAttribute("person"));
        }
    }
    
    public void writeContent(PrintWriter out,List<Person> person){
        out.println("<html>");
        out.println("<body>");
        
        out.println("<form method=GET action=AllNamesServlet>");
        out.println("<br/>");
        displayAllNames(out, person);
        out.println("<input type='submit' name='showAllNames' value='Show All Names'>");
        out.println("<br><br>");        
        out.println("</form>");
        
        out.println("<form method=GET action=AddNamesServlet>");
        out.println("Key = <input type=text name=key>");
        out.println("First Name = <input type=text name=firstName>");
        out.println("Last Name = <input type=text name=lastName>");        
        out.println("<input type=submit name=addNew value=Add>");
        out.println("</form>");
        
        out.println("<form method=GET action=RemoveNamesServlet>");
        out.println("Key = <input type=text name=key>");
        out.println("<input type=submit name=remove value=Remove>");
        out.println("</form>");
        
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    public void displayAllNames(PrintWriter out,List<Person> person){
        if(person!=null){
            out.println("List of Names <br>");
            for(Person p:person){
                   out.println("key = "+p.getKey()+", First Name = "+p.getFirstName()+", Last Name = "+p.getLastName());
                   out.println("<br>");
            }
        }
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
