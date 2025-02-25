package employeePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDOB {

	public void EmployeeRegister(Employee e) throws SQLException, ClassNotFoundException{
		
		
		String query = "INSERT INTO employees"+
		"(id, firstname, lastname, username, password, address, contactno) VALUES"+
		"(?, ?, ?, ?, ?,?,?);";
		
		String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&allowPublicKeyRetrieval=true";
		String userName = "root";
		String passWord = "Ilovehinata_17";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,passWord);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1,e.getId());
		pst.setString(2, e.getFirstname());
		pst.setString(3, e.getLastname());
		pst.setString(4, e.getUsername());
		pst.setString(5, e.getPassword());
		pst.setString(6,e.getAddress());
		pst.setString(7, e.getContactno());
		int row = pst.executeUpdate();
		System.out.println("Number of rows inserted"+row);
		con.close();
	}

}
