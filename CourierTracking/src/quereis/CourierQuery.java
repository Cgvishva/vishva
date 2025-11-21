package quereis;

public class CourierQuery {
	
	public static final String ADD = "INSERT INTO courier(sender_name, receiver_name,source,destination, status) VALUES(?,?,?,?,?)";
	
	public static final String ALL_COURIERS = "SELECT * FROM courier ORDER BY id";
	
	public static final String UPDATE =  "UPDATE courier SET status=? WHERE id=?";
	
	public static final String DELETE = "DELETE FROM courier WHERE id=?";
}
