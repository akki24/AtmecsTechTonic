package com.atmecs.pojo;

import java.io.Serializable;

public class InterestedEmployee implements Serializable{
	private String email;
	private int talkId;
	public InterestedEmployee(String email, int talkId) {
		super();
		this.email = email;
		this.talkId = talkId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTalkId() {
		return talkId;
	}
	public void setTalkId(int talkId) {
		this.talkId = talkId;
	}
	@Override
	public String toString() {
		return "InterestedEmployee [email=" + email + ", talkId=" + talkId + "]";
	}
	
	
	
}
