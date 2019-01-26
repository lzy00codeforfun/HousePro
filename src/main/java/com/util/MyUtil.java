package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import com.ssm.pojo.Deal;
import com.ssm.pojo.Member;
import com.ssm.pojo.RentHouse;
import com.ssm.pojo.User;
import com.ssm.service.IAdminService;
import com.ssm.service.IDealService;
import com.ssm.service.IEarningService;
import com.ssm.service.IMemberService;
import com.ssm.service.IPhotoService;
import com.ssm.service.IRentHouseService;
import com.ssm.service.IUsedPwdService;
import com.ssm.service.IUserService;
import com.ssm.service.IWantedHouseService;
public class MyUtil {
	@Resource
	private IAdminService adminSer; 
	@Resource
	private IEarningService earningSer; 
	@Resource
	private IUserService userSer; 
	@Resource
	private IDealService dealSer; 
	@Resource
	private IPhotoService photoSer; 
	@Resource
	private IMemberService memberSer; 
	@Resource
	private IRentHouseService rhSer; 
	@Resource
	private IWantedHouseService whSer; 
	@Resource
	private IUsedPwdService pwdSer; 
	private static int lim=1;	// limit of similarity
    public static Date S2D(String time) throws ParseException{		//String to Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//yyyy-mm-dd, 会出现时间不对, 因为小写的mm是代表: 秒
        return sdf.parse(time);
    }
    public static Date getNowDate() throws ParseException {	//获取系统当前时间
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
       // System.out.println();
    	return S2D(df.format(new Date()));
    }
    public static boolean IsPassword(String str) {	//判断密码是否合法
		String regex1="^[A-Za-z0-9]+${8,16}";	//数字+字母 8-16位长
		String regex2=".*[0-9].*[0-9].*";	//至少包含两个数字
		String regex3="(.*[A-Z].*[a-z].*)|(.*[a-z].*[A-Z].*)";	//不允许全大写或全小写
		return str.matches(regex1) && str.matches(regex2) && str.matches(regex3);
	}
	public static boolean IsID(String str) {	//判断身份证号是否合法（15位，18位均可）
		String regex="(^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{2}[0-9Xx]$)";
		return str.matches(regex);	
	}
	public static boolean IsPhone(String str) {	//判断手机号是否合法
		String regex="^((13[0-9])|(15[^4,\\D])|(17[0-9])|(18[0,5-9]))\\d{8}$";
		return str.matches(regex);	
	}
	public static boolean IsUsername(String str) {	//判断用户名是否合法
		/*取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾 
     	用户名有最小长度和最大长度限制，比如用户名必须是3-16位 */
		String regex="[\\w\u4e00-\u9fa5]{"+3+","+16+"}(?<!_)";
		return str.matches(regex);	
	}
	public static int findLCS(String A, int n, String B, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j] > dp[i][j - 1] ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }
        return dp[n][m];
    }
	public static Boolean IsSimilar(String str1,String str2) {	//To determine whether a string is similar
		int n=str1.length();
		int m=str2.length();
		if(Math.abs(n-m)>lim) return false;
		Boolean result=findLCS(str1, n, str2, m)+lim>=Math.min(n,m);
		return result;
	}
	public static String Date2Month(Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int month=cal.get(Calendar.MONTH)+1;
		if(month<10) return cal.get(Calendar.YEAR)+"-0"+month;
		else return cal.get(Calendar.YEAR)+"-"+month;
		
	}
	public static Date NextMonth(Date d,int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),1);
		cal.add(Calendar.MONTH,n);
		return cal.getTime();
	}
	public static Date EndMonth(Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),1);
		cal.add(Calendar.MONTH,+1);
		cal.add(Calendar.DATE,-1);
		return cal.getTime();
	}
	public static Date NextDay(Date d,int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MONTH,n);
		return cal.getTime();
	}
	public int request_deal(String renter_username,Integer house_id,Integer month) throws ParseException { //number of month
		System.out.println("in request myutil");
		System.out.println("house_id"+house_id);
	/*	RentHouse house=rhSer.select(house_id);
		System.out.println("select house done");
		
		if(house==null) {
			return -1;
		}
		System.out.println("house"+house.toString());*/
		User renter=userSer.select(renter_username);
		if(renter==null) return -1;
	/*	User landlord=userSer.select(house.getUsername());
		if(landlord==null) return -1; 
		Date nowd=MyUtil.getNowDate();
		Integer tol=house.getRent()*month;
		Member rm=memberSer.select(renter.getRenter_lv());
		Member lm=memberSer.select(landlord.getLandlord_lv());
		Integer coid=null;
		System.out.println("begin insert deal");
		Deal deal=new Deal(coid,renter_username,landlord.getUsername(),house_id,nowd,MyUtil.NextDay(nowd,month),house.getRent(),tol,(int)(tol*rm.getFee_rate()),(int)(tol*lm.getFee_rate()),
					"0",nowd,nowd);
		dealSer.insert(deal);
		System.out.println("insert deal done");*/
		return 1;
	}
}
