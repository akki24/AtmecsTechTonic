package com.atmecs.pojo;

import java.io.Serializable;
import java.util.Date;

public class TechTonicsDetails implements Serializable {
	private int id;
	private Date presentationDate;
	private String presentationTitle;
	private String presentationDescription;
	private String presenterName;
	public TechTonicsDetails(Date presentationDate, String presentationTitle, String presentationDescription,
			String presenterName) {

		this.presentationDate = presentationDate;
		this.presentationTitle = presentationTitle;
		this.presentationDescription = presentationDescription;
		this.presenterName = presenterName;
	}
	
	
	public TechTonicsDetails(int id, Date presentationDate, String presentationTitle, String presentationDescription,
			String presenterName) {
		super();
		this.id = id;
		this.presentationDate = presentationDate;
		this.presentationTitle = presentationTitle;
		this.presentationDescription = presentationDescription;
		this.presenterName = presenterName;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPresentationDate() {
		return presentationDate;
	}
	public void setPresentationDate(Date presentationDate) {
		this.presentationDate = presentationDate;
	}
	public String getPresentationTitle() {
		return presentationTitle;
	}
	public void setPresentationTitle(String presentationTitle) {
		this.presentationTitle = presentationTitle;
	}
	public String getPresentationDescription() {
		return presentationDescription;
	}
	public void setPresentationDescription(String presentationDescription) {
		this.presentationDescription = presentationDescription;
	}
	public String getPresenterName() {
		return presenterName;
	}
	public void setPresenterName(String presenterName) {
		this.presenterName = presenterName;
	}
	@Override
	public String toString() {
		return "TechTonicsDetails [id=" + id + ", presentationDate=" + presentationDate + ", presentationTitle="
				+ presentationTitle + ", presentationDescription=" + presentationDescription + ", presenterName="
				+ presenterName + "]";
	}
	
	
}
