package com.webkorps.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.webkorps.model.Alien;
public class AlienDao {

	public Alien getAlien(int aid)
		{
		Alien a=new Alien();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mvc","root","1234");
		Statement st=con.createStatement();
		//ps.setInt(1, aid);
		ResultSet rs=st.executeQuery("select * from maven where aid=" +aid);
		if(rs.next())
		{
		a.setAid(rs.getInt("aid"));
		a.setAname(rs.getString("aname"));
		a.setTech(rs.getString("tech"));
		}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		return a;
		}
	public int InsertAlign(int aid,String aname,String tech)
	{
		int i=0;
		Alien a=new Alien();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mvc","root","1234");	
			PreparedStatement ps=con.prepareStatement("insert into maven value(?,?,?)");
			a.setAid(aid);
			a.setAname(aname);
			a.setTech(tech);
			ps.setInt(1, a.getAid());
			ps.setString(2, a.getAname());
			ps.setString(3, a.getTech());
			
			 i=ps.executeUpdate();
		}
			
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		return i;

	}
	public int Delete(int aid)
	{
		int i=0;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mvc","root","1234");
	Statement st=con.createStatement();
	//ps.setInt(1, aid);
	i=st.executeUpdate("delete from maven where aid=" +aid);
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	return i;
	}
}
	



