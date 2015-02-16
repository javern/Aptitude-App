package com.aptitudeguru.dashboard;

public class PuzzleTable {
	
	int _puzzleid;
	String _puzzleques;

	String _sol;

	
	public PuzzleTable() {

	}

	
	public PuzzleTable(int puzzleid, String puzzleques, String sol) {
		this._puzzleid = puzzleid;
		this._puzzleques = puzzleques;
		
		this._sol = sol;
	}

	public PuzzleTable(String puzzleques, String sol) {

		this._puzzleques = puzzleques;

		this._sol = sol;
	}

	
	public int getID() {
		return this._puzzleid;
	}


	public void setID(int puzzleid) {
		this._puzzleid = puzzleid;
	}

	
	public String getQues() {
		return this._puzzleques;
	}

	
	public void setQues(String puzzleques) {
		this._puzzleques = puzzleques;
	}

	public String getSol() {
		return this._sol;
	}

	public void setSol(String sol) {
		this._sol = sol;
	}
	

}
