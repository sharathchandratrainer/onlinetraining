package com.orghrm.Testsuite;

import com.orghrm.Master.orgMaster;

public class orghrmtestsuite {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		//logintest
		String res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		//empregtest
		
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Empreg("Priyanka123456", "R");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//userregtest
		
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Userreg("Priyanka123456 R", "PriyankaR12346", "PriyankaR12345", "PriyankaR12345");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//user login test
		
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("PriyankaR12346", "PriyankaR12345");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		

	}

}
