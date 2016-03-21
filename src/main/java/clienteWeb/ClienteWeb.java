package clienteWeb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cliente")
public class ClienteWeb extends HttpServlet{
	private static final long serialVersionUID = 1L;
	int get =0;
	int post=0;
	int apagar=0;
	int inserir=0;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		get += 1;
		System.out.println("Entrou doGet !!! "+ get);
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Entrou no método doGet !!! "+ get);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		post += 1;
		System.out.println("Entrou no método doPost !!! " + post);
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Entrou no método doPost !!! "+ post);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		inserir += 1;
		System.out.println("Entrou no método doPut !!! " + inserir);
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Entrou no método doPut !!! "+ inserir);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		apagar += 1;
		System.out.println("Entrou no método doDelete !!! " + apagar);
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Entrou no método doDelete !!! "+ apagar);
	}

}
