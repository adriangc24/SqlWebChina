package hello;

import java.sql.*;

public class Connection implements ConnectionJDBC {
	public static java.sql.Connection connection;

	public static void conexionJDBC() {
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, user, password);

		
		
	} catch (ClassNotFoundException ex) {
		System.out.println("Error al registrar el driver de MySQL: " + ex);
		
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Excepcion MYSQL : "+e);
	}
	System.out.println("Conexion a base dedatos " + db + " correcta.");

	}
	}
