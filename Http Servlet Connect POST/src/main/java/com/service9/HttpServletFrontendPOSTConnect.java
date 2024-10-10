package com.service9;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpServletFrontendPOSTConnect extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("Cname");
        String age = request.getParameter("Cage");
        String branch = request.getParameter("branch");
        String semester = request.getParameter("semester");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobby");

        out.println("<html><body>");
        out.println("<h2>Registration Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("<p>Branch: " + branch + "</p>");
        out.println("<p>Semester: " + semester + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Hobbies: ");
        if (hobbies != null) {
            for (String hobby : hobbies) {
                out.println(hobby + " ");
            }
        }
        out.println("</p>");
        out.println("</body></html>");
    }

	
}