package com.aptitudeguru.dashboard;

public class JavaTable {
	
	int _javaid;
	String _javaques;
	String _javacat;
	String _option1;
	String _option2;
	String _option3;
	String _option4;
	String _sol;

	
	public JavaTable() {

	}

	
	public JavaTable(int javaid, String javaques, String javacat,
			String option1, String option2, String option3, String option4,
			String sol) {
		this._javaid = javaid;
		this._javaques = javaques;
		this._javacat = javacat;
		this._option1 = option1;
		this._option2 = option2;
		this._option3 = option3;
		this._option4 = option4;
		this._sol = sol;
	}

	public JavaTable(String javaques, String javacat, String option1,
			String option2, String option3, String option4, String sol) {

		this._javaques = javaques;
		this._javacat = javacat;
		this._option1 = option1;
		this._option2 = option2;
		this._option3 = option3;
		this._option4 = option4;
		this._sol = sol;
	}


	public int getID() {
		return this._javaid;
	}


	public void setID(int javaid) {
		this._javaid = javaid;
	}

	
	public String getQues() {
		return this._javaques;
	}

	
	public void setQues(String javaques) {
		this._javaques = javaques;
	}

	
	public String getCat() {
		return this._javacat;
	}

	
	public void setCat(String javacat) {
		this._javacat = javacat;
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
