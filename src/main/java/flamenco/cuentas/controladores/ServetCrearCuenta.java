/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flamenco.cuentas.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lauraflamenco
 */
public class ServetCrearCuenta extends HttpServlet {

   
  public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       //VISTA// PrintWriter out = response.getWriter();
        //Aqui ya se creo una cuenta 
        //out.println("<center>");
        //out.println("Cuenta creada con exito");
         //out.println("</center>");
        //RUTA DE LA JSP
        RequestDispatcher despachador=request.getRequestDispatcher("/chica-hermosa.jsp");
        
        despachador.forward(request, response);
        }
    }

