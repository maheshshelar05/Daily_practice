package com.controller;

import com.service.HotelService;

public class HotelController {

	
	public static void main(String[] args) {
		
		HotelService hs=new HotelService();
//		hs.insertData();
//		hs.deleteSingleRecord();
	//	hs.updateRecord();
		hs.getSingleRecord();
	}
}
