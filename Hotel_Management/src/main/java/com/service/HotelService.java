package com.service;

import com.dao.HotelDao;

public class HotelService {

	public void insertData()
	{
		HotelDao hd=new HotelDao();
		hd.insertData();
	}
	
	public void deleteSingleRecord()
	{
		HotelDao hd=new HotelDao();
		hd.deleteSingleRecord();
	}
	
	public void updateRecord()
	{
		HotelDao hd=new HotelDao();
		hd.updateRecord();
	}
	
	public void getSingleRecord()
	{
		HotelDao hd=new HotelDao();
		hd.getSingleRecord();
	}
}
