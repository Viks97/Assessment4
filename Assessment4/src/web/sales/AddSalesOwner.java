package web.sales;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import web.localAd.ConnectionManager;
import web.localAd.User;


/**
 * Servlet implementation class AddSalesOwner
 */
@WebServlet("/AddSalesOwner")
public class AddSalesOwner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSalesOwner() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("Sales");
		MongoCollection<Document> collection = db.getCollection("salesowner");
		
		String newName=request.getParameter("newName");
		String newPrice=request.getParameter("newPrice");
		String newCondition=request.getParameter("newCondition");
	
	
	Document document = new Document("name",newName).append("price",newPrice).append("condition", newCondition);
	collection.insertOne(document);
		request.getRequestDispatcher("AddSalesOwner.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
