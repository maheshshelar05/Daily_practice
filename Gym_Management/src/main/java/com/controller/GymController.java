package com.controller;

import com.service.GymService;

public class GymController {

	public static void main(String[] args) {
		
		GymService gs=new GymService();
//		gs.insertRecord();
//		gs.updateRecord();
//		gs.deleteRecord();
		gs.getAllRecord();
//		gs.getSingleRecord();
	}
}
