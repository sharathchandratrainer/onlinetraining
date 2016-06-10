package com.orghrm.tests;

import com.orghrm.Master.orgMaster;

public class userloginTest {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("PriyankaR1234567", "PriyankaR12345");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
