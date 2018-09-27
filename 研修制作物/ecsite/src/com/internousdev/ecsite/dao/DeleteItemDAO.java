package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteItemDAO extends ActionSupport  {


	private DBConnector dbConnector = new DBConnector();															//
	private Connection connection = dbConnector.getConnection();												//



	public void ItemDelete(String name, String price, String stock) throws SQLException {

		String sql = "DELETE FROM item_info_transaction WHERE item_name = ? AND item_price = ? AND item_stock = ?";

//		String sql = "INSERT INTO item_info_transaction (item_name, item_price, item_stock) VALUES(?, ? ,?)";

		PreparedStatement preparedStatement;																					//preparedStatementの変数化

		try {

			preparedStatement = connection.prepareStatement(sql);													//SQL文の実行。値の所得
			preparedStatement.setString(1, name);																				//バインド変数のパラメーター設定 ひとつめの?に代入するという意味
			preparedStatement.setString(2, price);																					//バインド変数のパラメーター設定
			preparedStatement.setString(3, stock);																					//バインド変数のパラメーター設定
			System.out.println("sss");
			preparedStatement.execute();

		}

		catch (SQLException e) {e.printStackTrace();}																		//
		finally {connection.close();}																									//

}


}


