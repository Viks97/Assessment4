package web.sales;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import web.localAd.*;


/**
 * Servlet implementation class SalesOwner
 */
@WebServlet("/SalesOwner.do")
public class SalesOwner extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<salesownerGS> dataList;
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public view() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		MongoClient connection = ConnectionManager.getMongo();
		dataList= new ArrayList<>();
		MongoDatabase db = ConnectionManager.getDb("Sales");
		MongoCollection<Document> collection = db.getCollection("salesowner");
		MongoCursor<Document> cursor;
		cursor = collection.find().limit(30).iterator();
		
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			 salesownerGS sogs = new salesownerGS(d.getString("name"), d.getString("price"), d.getString("condition"));
			dataList.add(sogs);
		}
		request.setAttribute("data", dataList);
		request.getRequestDispatcher("SalesOwner.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		doGet(request, response);
	}

}
