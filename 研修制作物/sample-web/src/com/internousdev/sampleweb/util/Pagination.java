package com.internousdev.sampleweb.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.sampleweb.dto.PaginationDTO;
import com.internousdev.sampleweb.dto.ProductInfoDTO;

public class Pagination {

// initialize(List<ProductInfoDTO> list, int pageSize)
// getPage(List<ProductInfoDTO> list, int pageSize, String pageNo)


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public PaginationDTO initialize(List<ProductInfoDTO> list, int pageSize) {

		PaginationDTO paginationDTO = new PaginationDTO();

		// 全ページ数
		paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));											//リストの行数(カラム数)とページサイズを割る
		// setTotalPageSize(int Math.ceil(81/9)) = setTotalPageSize(int 9)														//9


		// 現在のページ番号
		paginationDTO.setCurrentPageNo(1);																									//1

		// 全レコード数
		paginationDTO.setTotalRecordSize(list.size() - 1);																					//81-10=80

		// 現在のページ番号に対する開始レコード番号（オフセット）
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1));					//0番(listで言う一番目)

		// 現在のページ番号に対する終了レコード番号
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize - 1));					//0+9-1 = 8 (listで言う9番目)

		// ページ数をリストに代入

		List<Integer> pageNumberList = new ArrayList<Integer>();

		for
		(
				int pageNumber = 1;
				pageNumber <= paginationDTO.getTotalPageSize();																	//9回繰り返す
				pageNumber++
		)

		{pageNumberList.add(pageNumber);}

		// レコードのiteratorを繰り返す回数

		List<ProductInfoDTO> productInfoPages = new ArrayList<ProductInfoDTO>();

		for
		(
		int pageNumberOffset=paginationDTO.getStartRecordNo();																//int に 0を代入する
		pageNumberOffset <= paginationDTO.getEndRecordNo();																	//8以下ならtrue
		pageNumberOffset++																																//intに1を足す
		)
		{productInfoPages.add(list.get(pageNumberOffset));}																			//intの値を代入していく

		paginationDTO.setCurrentProductInfoPage(productInfoPages);															//setCurrentProductInfoPageにリストを代入する


		//

		if
		((paginationDTO.getStartRecordNo() - 1) <= 0)																					//0-1 <=0
		{paginationDTO.setPreviousPage(false);}																								//

		else
		{
			paginationDTO.setPreviousPage(true);																								//
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);									//
		}

		//

		if
		(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize())					//
		{paginationDTO.setNextPage(false);}																									//

		else
		{
			paginationDTO.setNextPage(true);																									//
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);										//
		}

		return paginationDTO;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//	 .setTotalPageSize						リスト数とページサイズを割った数字を出し、総ページ数を出す			sessionオブジェクトとしてjspで使用
//
//	 .setCurrentPageNo						現在のページ数をそのまま数値として表している							sessionオブジェクトとしてjspで使用
//
//	 .setTotalRecordSize					レコードの全幅を表す
//	 .setStartRecordNo						レコードの初期値を表す
//	 .setEndRecordNo						レコードの到達値を表す
//
// .setCurrentProductInfoPage		初期値から到達値までのレコードが格納されたリスト						sessionオブジェクトとしてjspで使用
//
//
//
//
//

	public PaginationDTO getPage(List<ProductInfoDTO> list, int pageSize, String pageNo) {

		PaginationDTO paginationDTO = new PaginationDTO();
		// 全ページ数
		paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));										//9
		// 現在のページ番号
		paginationDTO.setCurrentPageNo(Integer.parseInt(pageNo));														//1
		// 全レコード数
		paginationDTO.setTotalRecordSize(list.size() - 1);																				//80



		// 現在のページ番号に対する開始レコード番号（オフセット）決められた基準点の事
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1)); 				//9*0  =0
		// 現在のページ番号に対する開始レコード番号
//		paginationDTO.setStartRecordNo((pageSize * paginationDTO.getCurrentPageNo()) + 1);
		// 現在のページ番号に対する終了レコード番号					オフセットに対して動ける範囲(端っこ)
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize - 1));				//0+9-1=8



		List<Integer> pageNumberList = new ArrayList<Integer>();

		for
		(
				int pageNumber = 1;
				pageNumber <= paginationDTO.getTotalPageSize();
				pageNumber++
		)
		{pageNumberList.add(pageNumber);}//1~9

//いるのかこれい↑

		List<ProductInfoDTO> productInfoPages = new ArrayList<ProductInfoDTO>();

		for
		(
				int pageNumberOffset=paginationDTO.getStartRecordNo();
				pageNumberOffset <= paginationDTO.getEndRecordNo();
				pageNumberOffset++
		)
		{productInfoPages.add(list.get(pageNumberOffset));}//0~8

		paginationDTO.setCurrentProductInfoPage(productInfoPages);

		//previous nextはcurrentpageの数を操作しているもの。
		//真偽を付加し、currentpageの数を変化させている

		if
		((paginationDTO.getStartRecordNo() - 1) <= 0) 																			//0-1 <=0 0レコード以下ならtrue
		{paginationDTO.setPreviousPage(false);}//

			else
			{
			paginationDTO.setPreviousPage(true);
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);//1-1
			}

		if
		(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize())			//8+9>80 ＊ページサイズ以上であればtrue
		{paginationDTO.setNextPage(false);}


			else
			{
			paginationDTO.setNextPage(true);
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);//1+1
			}
//いるのかろうか？↑
		return paginationDTO;

	}

}
