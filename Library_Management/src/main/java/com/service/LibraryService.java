package com.service;

import com.dao.LibraryDao;

public class LibraryService {

	public void insertRecord() {
		LibraryDao l = new LibraryDao();
		l.insertRecord();
	}

	public void deleteSingleRecord() {
		LibraryDao l = new LibraryDao();
		l.deletesingleRecord();
	}

	public void updateRecord() {
		LibraryDao l = new LibraryDao();
		l.updateRecord();
	}

	public void getSingleRecord() {

		LibraryDao l = new LibraryDao();
		l.getSingleRecord();
	}

}
