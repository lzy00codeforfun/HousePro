package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.PhotoMapper;
import com.ssm.pojo.Photo;
import com.ssm.pojo.PhotoExample;
import com.ssm.pojo.PhotoExample.Criteria;
import com.ssm.service.IPhotoService;

@Service("PhotoService")
public class PhotoService implements IPhotoService{
	@Resource
    private PhotoMapper PhotoDao;
	public int insert(int house_id,String url) {
		Photo photo=new Photo(null,house_id,url,"normal");
		PhotoDao.insert(photo);
		return 1;
	}
	public List<Photo> select(int house_id) {
		PhotoExample example = new PhotoExample();
		Criteria criteria = example.createCriteria();
		criteria.andHouse_idEqualTo(house_id);
		example.setOrderByClause("tag asc");
		return PhotoDao.selectByExample(example);
	}
	public List<Photo> select_all() {
		PhotoExample example = new PhotoExample();
		return PhotoDao.selectByExample(example);
	}
	public Photo select_cover(int house_id) {
		PhotoExample example = new PhotoExample();
		Criteria criteria = example.createCriteria();
		criteria.andHouse_idEqualTo(house_id);
		example.setOrderByClause("tag asc");
		List<Photo> list=PhotoDao.selectByExample(example);
		if(list.size()==0) return null;
		return list.get(0);
	}
	public int insert_cover(int house_id,String url) {
		Photo list=select_cover(house_id);
		if(list!=null) {
			Photo value=list ;
			value.setTag("normal");
			PhotoDao.updateByPrimaryKeySelective(value);
		}
		Photo photo=new Photo(null,house_id,url,"cover");
		PhotoDao.insert(photo);
		return 1;
	}
	public int set_cover(int house_id,int photo_id) {
		Photo list=select_cover(house_id);
		Photo photo=new Photo(photo_id,null,null,"cover");
		if(list==null) {
			PhotoDao.updateByPrimaryKeySelective(photo);
		}
		else {
			PhotoDao.updateByPrimaryKeySelective(photo);
			Photo value=list;
			value.setTag("normal");
			PhotoDao.updateByPrimaryKeySelective(value);
		}
		return 1;
	}
	public int delete(int photo_id) {
		PhotoDao.deleteByPrimaryKey(photo_id);
		return 1;
	}
	public int delete_house(int house_id) {
		PhotoExample example = new PhotoExample();
		Criteria criteria = example.createCriteria();
		criteria.andHouse_idEqualTo(house_id);
		List<Photo> list=PhotoDao.selectByExample(example);
		for(Photo value:list) {
			PhotoDao.deleteByPrimaryKey(value.getPhoto_id());
		}
		return 1;
	}
}
