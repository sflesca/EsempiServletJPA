package psw.esempiojpa.servlet;

import psw.esempiojpa.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListaArticoli", urlPatterns = {"/listaclienti"})
public class ListaArticoli extends HttpServlet {

    @PersistenceContext
    EntityManager em;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Query q  = em.createNamedQuery("getClienti");
        List<Cliente> lc = q.getResultList();
        request.setAttribute("lc", lc);
        RequestDispatcher rd = request.getRequestDispatcher("/viewlistaclienti.jsp");
        rd.forward(request,response);
    }
}
