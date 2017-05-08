package com.atmecs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.atmecs.pojo.InterestedEmployee;
import com.atmecs.pojo.TechTalkLogin;
import com.atmecs.pojo.TechTonicsDetails;



public class TechTalkDao {
	private PreparedStatement ps1, ps2, ps3, ps4, ps5, ps6, ps7, ps8,ps9,ps10,ps11;
	private Connection con;

	public TechTalkDao() throws Exception {
		con = DbUtils.getConnection();

		ps1 = con.prepareStatement("insert into TechTalkLogin values(?,?,?)");
		ps2 = con.prepareStatement("select * from TechTalkLogin where email=?");
		ps3 = con.prepareStatement("select * from TechTalkLogin where email=? and password=?");
		ps4 = con.prepareStatement("select * from techtonicspresentation");
		ps5 = con.prepareStatement(
				"insert into techtonicspresentation(presentationDate,presentationTitle,presentationDescription,presenterName) values(?,?,?,?)");
		ps6 = con.prepareStatement("delete from techtonicspresentation where id=?");
		ps7 = con.prepareStatement("select * from techtonicspresentation where id=?");
		ps8 = con.prepareStatement(
				"update techtonicspresentation set presentationDate=?, presentationTitle=? ,presentationDescription=?,presenterName=? where id=?");
		ps9=con.prepareStatement("select * from adminLogin where email=? and password=?");
		ps10 = con.prepareStatement("insert into InterestInTechTalk values(?,?)");
		ps11 = con.prepareStatement("select * from InterestInTechTalk");

	}

	public boolean registerUser(String email, String username, String password) throws SQLException {
		String flag;

		ps1.setString(1, email);
		ps1.setString(2, username);
		ps1.setString(3, password);

		ps2.setString(1, email);
		ResultSet rst = ps2.executeQuery();

		if (rst.next()) {
			flag = "duplicate email";
			return false;
		} else {
			ps1.executeUpdate();
			return true;
		}

	}

	public boolean fetchLoginDetails(String email, String password) throws SQLException {
		ps3.setString(1, email);
		ps3.setString(2, password);

		ResultSet rst = ps3.executeQuery();
		if (rst.next())
			return true;
		return false;
	}

	public ArrayList<TechTonicsDetails> fetchTechToniDetails() throws SQLException {
		ArrayList<TechTonicsDetails> list = new ArrayList<>();

		ResultSet rst = ps4.executeQuery();
		while (rst.next())
			list.add(new TechTonicsDetails(rst.getInt(1), rst.getDate(2), rst.getString(3), rst.getString(4),
					rst.getString(5)));
		System.out.println(list);
		return list;
	}

	public boolean addTechTalk(String presentationDate, String presentationTitle, String presentationDescription,
			String presenterName) throws SQLException {

		ps5.setString(1, presentationDate);
		ps5.setString(2, presentationTitle);
		ps5.setString(3, presentationDescription);
		ps5.setString(4, presenterName);

		int i = ps5.executeUpdate();

		if (i == 1)
			return true;
		return false;
	}

	public void deleteTechTalk(int id) throws SQLException {
		ps6.setInt(1, id);
		ps6.executeUpdate();

	}

	public TechTonicsDetails fetchTechTalkToUpdate(int id) throws SQLException {
		ps7.setInt(1, id);

		ResultSet rst = ps7.executeQuery();

		if (rst.next())
			return new TechTonicsDetails(rst.getInt(1), rst.getDate(2), rst.getString(3), rst.getString(4),
					rst.getString(5));
		return null;
	}
	public boolean updateTechTalk(int id,String presentationDate, String presentationTitle, String presentationDescription,
			String presenterName) throws SQLException{
		ps8.setString(1, presentationDate);
		ps8.setString(2, presentationTitle);
		ps8.setString(3, presentationDescription);
		ps8.setString(4, presenterName);
		ps8.setInt(5, id);
		
		if(ps8.executeUpdate()==1)
			return true;
		return false;
	}
	

	public boolean fetchAdminLoginDetails(String email, String password) throws SQLException {
		ps9.setString(1, email);
		ps9.setString(2, password);
		
		ResultSet rst = ps9.executeQuery();
		if (rst.next())
			return true;
		return false;
	}

	public boolean registerForTechtalk(String email, int id) throws SQLException {

		ps10.setString(1, email);
		ps10.setInt(2, id);
		
		int i = ps10.executeUpdate();

		if (i==1) {
			return true;
		} else {
			return false;
		}

	}
	public ArrayList<InterestedEmployee> interestedEmployees() throws SQLException {
		ArrayList<InterestedEmployee> list = new ArrayList<>();

		ResultSet rst = ps11.executeQuery();
		while (rst.next())
			list.add(new InterestedEmployee(rst.getString(1),rst.getInt(2)));
		System.out.println("List"+list);
		return list;
	}



}
