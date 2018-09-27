package com.internousdev.sampleweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sampleweb.dto.PurchaseHistoryInfoDTO;
import com.internousdev.sampleweb.util.DBConnector;

// getPurchaseHistoryList(String loginId)
// regist(String loginId, int productId, int productCount, int destinationId, int price)
// deleteAll(String loginId)

//------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class PurchaseHistoryInfoDAO {

	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryList(String loginId) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList = new ArrayList<PurchaseHistoryInfoDTO>();

		String sql = "SELECT"
				+ " PHI.id as id," 																						/* ID 						*/
				+ " PHI.user_id as user_id," 																	/* ユーザーID 			*/
				+ " PHI.product_count as product_count," 											/* 個数 					*/
				+ " PHI.price as price," 																			/* 値段 					*/
				+ " PHI.regist_date as regist_date," 														/* 登録日					*/
				+ " PHI.update_date as update_date," 													/* 更新日					*/

				+ " PI.product_id as product_id," 															/* 商品ID 					*/
				+ " PI.product_name as product_name," 												/* 商品名					*/
				+ " PI.product_name_kana as product_name_kana," 							/* 商品名かな			*/
				+ " PI.product_description as product_description," 								/* 商品詳細				*/
				+ " PI.category_id as category_id,"														/* カテゴリID			*/
				+ " PI.price," 																							/* 価格						*/
				+ " PI.image_file_name as image_file_name," 										/* 画像ファイルパス	*/
				+ " PI.image_file_path as image_file_path," 											/* 画像ファイル名		*/
				+ " PI.release_company," 																		/* 発売会社名			*/
				+ " PI.release_date," 																				/* 発売年月日			*/

				+ " DI.family_name as family_name,"														/* 姓							*/
				+ " DI.first_name as first_name," 															/* 姓							*/
				+ " DI.family_name_kana as family_name_kana," 								/* 姓かな					*/
				+ " DI.first_name_kana as first_name_kana," 										/* 名かな					*/
				+ " DI.email as email," 																			/* メールアドレス		*/
				+ " DI.tel_number as tel_number," 														/* 電話番号				*/
				+ " DI.user_address as user_address" 													/* 住所						*/

				+ " FROM purchase_history_info as PHI"
				+ " LEFT JOIN product_info as PI"
				+ " ON PHI.product_id = PI.product_id"
				+ " LEFT JOIN destination_info as DI"
				+ " ON PHI.destination_id = DI.id"
				+ " WHERE phi.user_id = ?"																	//引数を代入する(バインド変数)
				+ " ORDER BY regist_date DESC";

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//				" SELECT																				"			なぜasで変数化(もしくは略称化)しているかというと、resultsetに代入する際短くて済み、普段通りの感覚で代入できるからである
//
//				" PHI	.id								as id										" 			/* ID 					*/			purchase_history_info
//				" PHI	.user_id 						as user_id							" 			/* ユーザーID 		*/			purchase_history_info
//				" PHI	.product_count 			as product_count				" 			/* 個数 					*/			purchase_history_info
//				" PHI	.price 							as price								" 			/* 値段 					*/			purchase_history_info
//				" PHI	.regist_date 				as regist_date						" 			/* 登録日				*/			purchase_history_info
//				" PHI	.update_date 				as update_date					"	 		/* 更新日				*/			purchase_history_info
//
//				" FROM 																				"			主体部分を宣言する
//				" purchase_history_info 			as PHI									"			purchase_history_infoを変数PHIと定義する
//
//				" WHERE 																				"			指定条件を宣言する
//				" PHI	.user_id 					= ?											"			引数を代入する(バインド変数)
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//				" SELECT																				"			なぜasで変数化(もしくは略称化)しているかというと、resultsetに代入する際短くて済み、普段通りの感覚で代入できるからである
//
//				" PI		.product_id 					as product_id						" 			/* 商品ID 				*/			product_info
//				" PI		.product_name 			as product_name				" 			/* 商品名				*/			product_info
//				" PI		.product_name_kana 	as product_name_kana		" 			/* 商品名かな			*/			product_info
//				" PI		.product_description 	as product_description		" 			/* 商品詳細			*/			product_info
//				" PI		.category_id 				as category_id						"			/* カテゴリID			*/			product_info
//				" PI		.price																		" 			/* 価格					*/			product_info
//				" PI		.image_file_name 		as image_file_name			" 			/* 画像ファイルパス	*/			product_info
//				" PI		.image_file_path 			as image_file_path				" 			/* 画像ファイル名		*/			product_info
//				" PI		.release_company,													" 			/* 発売会社名			*/			product_info
//				" PI		.release_date,															" 			/* 発売年月日			*/			product_info
//
//				" LEFT JOIN 																		"			左外部結合を宣言する
//				" product_info 						as PI									"			product_infoと結合する、またPIという変数化する
//
//				" ON 																					"			左外部結合を宣言する
//				" PHI	.product_id 				 = PI.product_id						"			PHIのptoduct_idと値が同じproduct_infoのproduct_idの所だけを抽出する
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//				" SELECT																				"			なぜasで変数化(もしくは略称化)しているかというと、resultsetに代入する際短くて済み、普段通りの感覚で代入できるからである
//
//				" DI		.family_name 				as family_name					"			/* 姓						*/			destination_info
//				" DI		.first_name 					as first_name						" 			/* 姓						*/			destination_info
//				" DI		.family_name_kana 	as family_name_kana			" 			/* 姓かな				*/			destination_info
//				" DI		.first_name_kana 		as first_name_kana			" 			/* 名かな				*/			destination_info
//				" DI		.email 							as email								" 			/* メールアドレス		*/			destination_info
//				" DI		.tel_number 				as tel_number						" 			/* 電話番号			*/			destination_info
//				" DI		.user_address 				as user_address					" 			/* 住所					*/			destination_info
//
//				" LEFT JOIN 																		"			左外部結合を宣言する
//				" destination_info 					as DI									"			destination_infoと結合する、またDIという変数化する
//
//				" ON																						"			左外部結合を宣言する
//				" PHI  .destination_id 			= DI.id										"			PHIのdestination_idと値が同じdestination_infoのdestination_idの所だけを抽出する
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//				" ORDER BY 					regist_date DESC							"			登録順に表を並び替える
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);																							//引数の値をバインド変数に代入する

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				PurchaseHistoryInfoDTO purchaseHistoryInfoDto = new PurchaseHistoryInfoDTO();

				purchaseHistoryInfoDto.setId(resultSet.getInt("id"));

				purchaseHistoryInfoDto.setUserId(resultSet.getString("user_id"));
				purchaseHistoryInfoDto.setProductId(resultSet.getInt("product_id"));
				purchaseHistoryInfoDto.setProductCount(resultSet.getInt("product_count"));
				purchaseHistoryInfoDto.setPrice(resultSet.getInt("price"));
				purchaseHistoryInfoDto.setRegistDate(resultSet.getDate("regist_date"));
				purchaseHistoryInfoDto.setUpdateDate(resultSet.getDate("update_date"));

				purchaseHistoryInfoDto.setProductName(resultSet.getString("product_name"));
				purchaseHistoryInfoDto.setProductNameKana(resultSet.getString("product_name_kana"));
				purchaseHistoryInfoDto.setProductDescription(resultSet.getString("product_description"));
				purchaseHistoryInfoDto.setCategoryId(resultSet.getInt("category_id"));
				purchaseHistoryInfoDto.setImageFileName(resultSet.getString("image_file_name"));
				purchaseHistoryInfoDto.setImageFilePath(resultSet.getString("image_file_path"));
				purchaseHistoryInfoDto.setReleaseCompany(resultSet.getString("release_company"));
				purchaseHistoryInfoDto.setReleaseDate(resultSet.getDate("release_date"));

				purchaseHistoryInfoDto.setFamilyName(resultSet.getString("family_name"));
				purchaseHistoryInfoDto.setFirstName(resultSet.getString("first_name"));
				purchaseHistoryInfoDto.setFamilyNameKana(resultSet.getString("family_name_kana"));
				purchaseHistoryInfoDto.setFirstNameKana(resultSet.getString("first_name_kana"));
				purchaseHistoryInfoDto.setEmail(resultSet.getString("email"));
				purchaseHistoryInfoDto.setTelNumber(resultSet.getString("tel_number"));
				purchaseHistoryInfoDto.setUserAddress(resultSet.getString("user_address"));

				purchaseHistoryInfoDTOList.add(purchaseHistoryInfoDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return purchaseHistoryInfoDTOList;
	}


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public int regist(String loginId, int productId, int productCount, int destinationId, int price) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "insert into purchase_history_info(user_id, product_id, product_count, price, destination_id, regist_date, update_date) values (?, ?, ?, ?, ?, now(), '0000-01-01')";
		int count = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setInt(2, productId);
			preparedStatement.setInt(3, productCount);
			preparedStatement.setInt(4, price);
			preparedStatement.setInt(5, destinationId);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public int deleteAll(String loginId) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "delete from purchase_history_info where user_id=?";
		int count = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
}
