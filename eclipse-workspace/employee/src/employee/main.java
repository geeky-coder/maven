package employee;
import java.io.DataInputStream;
import java.sql.*;
public class main {
	public static void main(String args[]) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			//serverhost = localhost, port=3306, username=root, password=123
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/authentication","root","root");

			DataInputStream KB=new DataInputStream(System.in);

			//input employee id
			System.out.print("Enter Employee ID: ");
			String eid=KB.readLine();
			//input employee name
			System.out.print("Enter Employee Name: ");
			String en=KB.readLine();
			//input employee Date Of Birth
			System.out.print("Enter Employee Date Of Birth: ");
			String ed=KB.readLine();
			//input employee city
			System.out.print("Enter Employee City: ");
			String ec=KB.readLine();
			//input employee Salary
			System.out.print("Enter Employee Salary: ");
			String es=KB.readLine();

			//creating object of PreparedStatement class and passing parameter (?)
			PreparedStatement smt=cn.prepareStatement("insert into employees values(?,?,?,?,?)");

			// set the values
			smt.setString(1, eid);
			smt.setString(2, en);
			smt.setString(3, ed);
			smt.setString(4, ec);
			smt.setInt(5, Integer.parseInt(es));

			//to execute update
			smt.executeUpdate();
			System.out.println("Record Submitted....");
			
			//close the file
			cn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
	
