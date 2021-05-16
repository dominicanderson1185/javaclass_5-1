package com.example.server_1;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import java.nio.file.Paths;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
	public static void main(String[] args) throws IOException {

		try {
			ObjectMapper objectMapper = new ObjectMapper();

			My_Object my_object = new My_Object("Will Smith", "philly", "brown", 40);
			My_Object my_object1 = new My_Object("Robert stutter", "Detroit", "brown", 20);

			objectMapper.writeValue(new File("target/obj.json"), my_object);

		}
		catch(Exception e)
		{
			System.out.println("There seems to have been a error");
		}

String file = "target/obj.json";
		String now = readFileAsString(file);

	}

	private static String readFileAsString(String file) throws IOException {
		return new String(Files.readAllBytes(Paths.get(file)));
	}


	public void init(String now) {
		String messages = now; //messege
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response, String message) throws IOException {
		response.setContentType("text/html");

		// Hello
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>" + message + "</h1>");
		out.println("</body></html>");
	}

	public void destroy() {
	}

}