package com.SpringBootUniversity.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "University_Details")
public class University {
	@Id
    @GeneratedValue
    private int uniId;
    private String uniName;
    private int uniTotalCol;
	public University(int uniId, String uniName, int uniTotalCol) {
		super();
		this.uniId = uniId;
		this.uniName = uniName;
		this.uniTotalCol = uniTotalCol;
	}
	public int getUniId() {
		return uniId;
	}
	public void setUniId(int uniId) {
		this.uniId = uniId;
	}
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public int getUniTotalCol() {
		return uniTotalCol;
	}
	public void setUniTotalCol(int uniTotalCol) {
		this.uniTotalCol = uniTotalCol;
	}
	@Override
	public String toString() {
		return "Universities [uniId=" + uniId + ", uniName=" + uniName + ", uniTotalCol=" + uniTotalCol + "]";
	}
    
}
