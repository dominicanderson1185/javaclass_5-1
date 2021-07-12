package com.example.serverlet_assignment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static javax.swing.JOptionPane.showMessageDialog;

@WebServlet("/Login")
public class login extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name_id = request.getParameter("username");
		String name_id_pass = request.getParameter("password");

				if(name_id.equals("teacher") && name_id_pass.equals("A+")){
					response.sendRedirect("Hellofriend.jsp");
				}else{
					response.sendRedirect("index.jsp");
showMessageDialog(null, "Username or password is incorrect.Please try again. ");
				}
	}








}
