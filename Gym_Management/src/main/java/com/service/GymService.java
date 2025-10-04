package com.service;

import com.dao.GymDao;

public class GymService {

	
	public void insertRecord()
	{
		GymDao g=new GymDao();
		g.insertData();
	}
	
	public void deleteRecord()
	{
		GymDao g=new GymDao();
		g.deleteRecord();
	}
	
	public void updateRecord()
	{
		GymDao g=new GymDao();
		g.updateRecord();
	}
	
	public void getAllRecord()
	{
		GymDao g=new GymDao();
		g.getAllRecord();
	}
	
	public void getSingleRecord()
	{
		GymDao g=new GymDao();
		g.getSinglerecord();
	}
	
}
