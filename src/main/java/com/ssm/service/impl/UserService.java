package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.MemberMapper;
import com.ssm.dao.UsedPwdMapper;
import com.ssm.dao.UserMapper;
import com.ssm.pojo.UsedPwdExample;
import com.ssm.pojo.UsedPwdKey;
import com.ssm.pojo.User;
import com.ssm.pojo.UserExample;
import com.ssm.pojo.UsedPwdExample.Criteria;
import com.ssm.service.IUserService;
import com.util.MyUtil;

import java.text.ParseException;
import java.util.List;

@Service("userService")
public class UserService implements IUserService {

    @Resource
    private UserMapper UserDao;
    @Resource
    private MemberMapper MemberDao;
    @Resource
    private UsedPwdMapper UsedPwdDao;
    private Boolean pwdSer_insert(String username, String password) {
		UsedPwdExample example = new UsedPwdExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<UsedPwdKey> list=UsedPwdDao.selectByExample(example);
		if(list.isEmpty()==false) {
			return false;
		}
		UsedPwdDao.insert(new UsedPwdKey(username,password));
		return true;
	}
    private List<UsedPwdKey> pwdSer_select(String username) {
		UsedPwdExample example = new UsedPwdExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		return UsedPwdDao.selectByExample(example);
	}
    public int insert(String username,String pwd,String rname,String idtype,String idno,String phone,String area) throws ParseException {//插入用户
    	if(UserDao.selectByPrimaryKey(username)!=null) return -1;	//User name already exists
    	User user = new User(username,pwd,rname,idtype,idno,phone,area,MyUtil.getNowDate(),MyUtil.getNowDate(),1,1);
    	UserDao.insert(user);
    	pwdSer_insert(username,pwd);
    	return 1;
    }
    public User select(String username) {
    	return UserDao.selectByPrimaryKey(username);
    }
    public List<User> select_all() {
    	UserExample example = new UserExample();
    	return UserDao.selectByExample(example);
    }
    private Boolean update(String username,String pwd,String rname,String idtype,String idno,String phone,String area,Integer rentlv,Integer landlv) throws ParseException {
    	User user = new User(username,pwd,rname,idtype,idno,phone,area,null,MyUtil.getNowDate(),rentlv,landlv);
    	UserDao.updateByPrimaryKeySelective(user);
    	return true; 	
    }
    public int upd_phone(String username,String phone) throws ParseException {
    	User user = new User(username,null,null,null,null,phone,null,null,MyUtil.getNowDate(),null,null);
    	UserDao.updateByPrimaryKeySelective(user);
    	return 1;//success
    }
    public int upd_info(String username,String rname,String idtype,String idno,String phone,String area) throws ParseException {
    	User user = new User(username,null,rname,idtype,idno,phone,area,null,MyUtil.getNowDate(),null,null);
    	UserDao.updateByPrimaryKeySelective(user);
    	return 1;//success
    }
    public int upd_pwd(String username,String pwd) throws ParseException {
    	List<UsedPwdKey> list=pwdSer_select(username);
    	if(list.isEmpty()==false) {
    		System.out.println("checking");
    		for(UsedPwdKey value:list){
                if(MyUtil.IsSimilar(value.getPassword(),pwd)) return -1; //password similar to used-pwd
            }
    	}
    	if(pwdSer_insert(username,pwd)==false) return -1;	//password similar to used-pwd
    	update(username,pwd,null,null,null,null,null,null,null);
    	return 1;//success
    }
    public int inc_rl(String username) {
    	User user = UserDao.selectByPrimaryKey(username);
    	if(MemberDao.selectByPrimaryKey(user.getRenter_lv()+1)!=null) {
    		user.setRenter_lv(user.getRenter_lv()+1);
    		UserDao.updateByPrimaryKeySelective(user);
    		return 1; //success
    	}
    	else return -1;//fail(arrived top-level)
    }
    public int inc_ll(String username) {
    	User user = UserDao.selectByPrimaryKey(username);
    	if(MemberDao.selectByPrimaryKey(user.getLandlord_lv()+1)!=null) {
    		user.setLandlord_lv(user.getLandlord_lv()+1);
    		UserDao.updateByPrimaryKeySelective(user);
    		return 1;//success
    	}
    	else return -1;//fail(arrived top-level)
    }
    public int login(String username,String password) {
    	User user=select(username);
    	if(user==null) {			
    		return -1;//username not found
    	}
    	if(user.getPassword().equals(password)) return 1; //success
    	return -2;	//password error
    }
    public int delete(String username) {
    	UserDao.deleteByPrimaryKey(username);
    	return 1;
    }
}