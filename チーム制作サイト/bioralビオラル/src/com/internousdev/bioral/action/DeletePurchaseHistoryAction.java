package com.internousdev.bioral.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bioral.dao.PurchaseHistoryInfoDAO;
import com.internousdev.bioral.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeletePurchaseHistoryAction extends ActionSupport implements SessionAware{
	private int ippan =0;
	private String categoryId;
	private String sex;
	private List<String> sexList = new ArrayList<String>();
	private static final String MALE ="男性";
	private static final String FEMALE = "女性";
	private String defaultSexValue = MALE;
	private Map<String, Object>session;
	private int count;
	public String execute(){
		String result =ERROR;
		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();


		if(ippan==0){
			count = purchaseHistoryInfoDAO.deleteAll();
		}else if(ippan==1){
			count = purchaseHistoryInfoDAO.deleteAll(String.valueOf(session.get("loginId")));
		}


		if(count >0){
			List<PurchaseHistoryInfoDTO>purchaseHistoryInfoDtoList = purchaseHistoryInfoDAO.getPurchaseHistoryList(String.valueOf(session.get("loginId")));
			Iterator<PurchaseHistoryInfoDTO> iterator =purchaseHistoryInfoDtoList.iterator();
			if(!(iterator.hasNext())){
				purchaseHistoryInfoDtoList = null;
			}
			session.put("purchaseHistoryInfoDtoList", purchaseHistoryInfoDtoList);

			sexList.add(MALE);
			sexList.add(FEMALE);

			result=SUCCESS;
 		}
		return result;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getSexList() {
		return sexList;
	}
	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
	}
	public String getDefaultSexValue() {
		return defaultSexValue;
	}
	public void setDefaultSexValue(String defaultSexValue) {
		this.defaultSexValue = defaultSexValue;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public int getIppan() {
		return ippan;
	}
	public void setIppan(int ippan) {
		this.ippan = ippan;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	}






