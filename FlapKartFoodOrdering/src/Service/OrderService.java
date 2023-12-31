package Service;

import DAO.UserDAO;
import Model.Order;

public class OrderService {
	private static OrderService orderService = null;
	private UserDAO userDAO = UserDAO.getInstance();
	public static OrderService getInstance()
	{
		if(orderService == null)
		{
			orderService = new OrderService();
		}
		return orderService;
	}
	public Order place_order(String restaurantName, Integer quantity)
	{
		return userDAO.placeOrder(restaurantName, quantity);
	}

}
