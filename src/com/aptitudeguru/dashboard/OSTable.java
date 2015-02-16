package com.aptitudeguru.dashboard;

public class OSTable {


	int _osid;
	String _osques;
	
	String _option1;
	String _option2;
	String _option3;
	String _option4;
	String _sol;

	
	public OSTable() {

	}

	
	public OSTable(int osid, String osques, String option1, String option2,
			String option3, String option4, String sol) {
		this._osid = osid;
		this._osques = osques;
		
		this._option1 = option1;
		this._option2 = option2;
		this._option3 = option3;
		this._option4 = option4;
		this._sol = sol;
	}

	public OSTable(String osques, String option1, String option2,
			String option3, String option4, String sol) {

		this._osques = osques;
	
		this._option1 = option1;
		this._option2 = option2;
		this._option3 = option3;
		this._option4 = option4;
		this._sol = sol;
	}

	
	public int getID() {
		return this._osid;
	}

	
	public void setID(int osid) {
		this._osid = osid;
	}

	
	public String getQues() {
		return this._osques;
	}

	
	public void setQues(String osques) {
		this._osques = osques;
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
