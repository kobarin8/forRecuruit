package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserAddCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();


	private String sql = "INSERT INTO login_user_transaction (login_id, login_pass, user_name, insert_date) VALUES(?, ? ,?, ?)";

	public void createUser(String setloginUserIdkey, String setloginUserPasswordkey, String setuserNamekey) throws SQLException {

		try {

			PreparedStatement

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, setloginUserIdkey);
			preparedStatement.setString(2, setloginUserPasswordkey);
			preparedStatement.setString(3, setuserNamekey);
			preparedStatement.setString(4, dateUtil.getDate());
			preparedStatement.execute();

			}

			catch(Exception e) {e.printStackTrace();}
			finally {connection.close();}

			}


}
