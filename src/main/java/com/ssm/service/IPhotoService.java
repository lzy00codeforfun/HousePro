package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Photo;

public interface IPhotoService {
	public int insert(int house_id,String url) ; //insert a normal photo
	public List<Photo> select(int house_id) ;	//select all photo belong to a house
	public Photo select_cover(int house_id);	//select cover photo belong to a house
	public List<Photo> select_all();
	public int insert_cover(int house_id,String url);	//insert a photo as cover
	public int set_cover(int house_id,int photo_id); //set a photo as cover
	public int delete(int photo_id);	//delete a photo
	public int delete_house(int house_id);	//delete all photo belong to a house
}
