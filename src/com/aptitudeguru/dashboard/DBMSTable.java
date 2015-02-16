package com.aptitudeguru.dashboard;

public class DBMSTable {

	
	int _dbmsid;
	String _dbmsques;
	
	String _option1;
	String _option2;
	String _option3;
	String _option4;
	String _sol;

	
	public DBMSTable() {

	}

	
	public DBMSTable(int dbmsid, String dbmsques, String option1,
			String option2, String option3, String option4, String sol) {
		this._dbmsid = dbmsid;
		this._dbmsques = dbmsques;
		
		this._option1 = option1;
		this._option2 = option2;
		this._option3 = option3;
		this._option4 = option4;
		this._sol = sol;
	}

	public DBMSTable(String dbmsques, String option1, String option2,
			String option3, String option4, String sol) {

		this._dbmsques = dbmsques;
		
		this._option1 = option1;
		this._option2 = option2;
		this._option3 = option3;
		this._option4 = option4;
		this._sol = sol;
	}

	
	public int getID() {
		return this._dbmsid;
	}

	
	public void setID(int dbmsid) {
		this._dbmsid = dbmsid;
	}

	
	public String getQues() {
		return this._dbmsques;
	}

	
	public void setQues(String dbmsques) {
		this._dbmsques = dbmsques;
	}

	
	public String getOption1() {
		return this._option1;
	}

	public String getOption2() {
		return this._option2;
	}

	public String getOption3() {
		return this._option3;
	}

	public String getOption4() {
		return this._option4;
	}

	public String getSol() {
		return this._sol;
	}

	public void setSol(String sol) {
		this._sol = sol;
	}

	
	public void setOption1(String option1) {
		this._option1 = option1;
	}

	public void setOption2(String option2) {
		this._option2 = option2;
	}

	public void setOption3(String option3) {
		this._option3 = option3;
	}

	public void setOption4(String option4) {
		this._option4 = option4;
	}

}
