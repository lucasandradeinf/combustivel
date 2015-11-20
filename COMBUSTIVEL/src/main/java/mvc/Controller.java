package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/combustivel")
public class Controller extends HttpServlet {

protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    String paramPalcool = req.getParameter("palcool");
    Double palcool = paramPalcool == null ? 0.0 : Double.parseDouble(paramPalcool);
    
    String paramPgasolina = req.getParameter("pgasolina");
    Double pgasolina = paramPgasolina == null ? 0.0 : Double.parseDouble(paramPgasolina);

    Model cImc = new Model();
    cImc.setPalcool(palcool);
    cImc.setPgasolina(pgasolina);
    cImc.calcularResultado();
    cImc.ifResultado();
    
    req.setAttribute("resultado", cImc); //Passando um objeto para o JSP.
    
    //Chamar o JSP apenas para mostrar o resultado.
    req.getRequestDispatcher("combustivel.jsp").forward(req, resp);
  }



}
