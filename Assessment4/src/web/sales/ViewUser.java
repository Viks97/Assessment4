package web.sales;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
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
import com.mongodb.client.model.Filters;

import web.localAd.ConnectionManager;
import web.localAd.User;
import web.localAd.salesdealerGS;

/**
 * Servlet implementation class ViewUser
 */
@WebServlet("/ViewUser.do")
public class ViewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<User> datalist;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		datalist=new ArrayList<>();
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("User");
		MongoCollection<Document> collection = db.getCollection("user");
		MongoCursor<Document> cursor = collection.find().limit(30).iterator();
		
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			 User u = new User(d.getString("name"), d.getString("email"), d.getString("phone"), d.getString("city"), d.getString("zipCode"));
			datalist.add(u);
		}

		//ConnectionManager.close();

		request.setAttribute("data", datalist);
		request.getRequestDispatcher("ViewUser.jsp").forward(request, response);

	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
