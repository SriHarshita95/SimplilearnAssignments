package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.util.DBConnection;

/**
 * Servlet implementation class ListProductsServlet
 */
@WebServlet("/listProducts")
public class ListProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBConnection dbConnection = new DBConnection();
		Connection connection = dbConnection.getConnection();

		try {
			// STEP 3: Create Statement Object
			Statement stmt = connection.createStatement();
			
			// Step 4: Execute query
			ResultSet rs = stmt.executeQuery("select * from product_14112021 ");
			
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			
			while(rs.next()) {
				
				Integer empId = rs.getInt("eproduct_id");
				String prodName = rs.getString("eproduct_name");
				Double productPrice = rs.getDouble("eproduct_price");
				
				out.println(empId+" ");
				out.println(prodName+" ");
				out.println(productPrice);
				out.println("<br/>");
			}
			
			out.println("</body></html>");
			
			
			// Step 5: Closing connection object
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
