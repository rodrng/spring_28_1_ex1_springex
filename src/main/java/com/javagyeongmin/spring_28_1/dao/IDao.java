package com.javagyeongmin.spring_28_1.dao;

import java.util.ArrayList;

import com.javagyeongmin.spring_28_1.dto.ContentDto;

public interface IDao {
	
	public ArrayList<ContentDto> listDao();
	public void writeDao(String mwriter, String mcontent);
	public ContentDto viewDao(String mid);
	public void deleteDao(String mid);
	
}
