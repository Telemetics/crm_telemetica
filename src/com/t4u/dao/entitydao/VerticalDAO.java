package com.t4u.dao.entitydao;

import java.util.List;

import com.t4u.bean.Vertical;

public interface VerticalDAO {
	
	public void createVertical(Vertical vertical);
	public Vertical getVertical(int id);
	public void updateVertical(Vertical vertical);
	public List<Vertical> getVerticals(String verticalType);
	public List<Vertical> getVerticals();

}
