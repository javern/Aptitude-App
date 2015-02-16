package com.aptitudeguru.dashboard;

public class VLTable {
	

    int _vlid;
    String _vlques;
    String _vlcat;
    String _option1;
    String _option2;
    String _option3;
    String _option4;
    String _sol;
     
  
    public VLTable(){
         
    }
   
    public VLTable(int vlid, String vlques, String vlcat,String option1,String option2,String option3,String option4,String sol){
        this._vlid = vlid;
        this._vlques = vlques;
        this._vlcat=vlcat;
        this._option1 = option1;
        this._option2 = option2;
        this._option3 = option3;
        this._option4 = option4;
        this. _sol=sol;
    }
    public VLTable( String vlques, String vlcat,String option1,String option2,String option3,String option4,String sol){
        
        this._vlques = vlques;
        this._vlcat=vlcat;
        this._option1 = option1;
        this._option2 = option2;
        this._option3 = option3;
        this._option4 = option4;
        this. _sol=sol;
    }
     
   
    public int getID(){
        return this._vlid;
    }
     
   
    public void setID(int vlid){
        this._vlid = vlid;
    }
     
  
    public String getQues(){
        return this._vlques;
    }
     
   
    public void setQues(String vlques){
        this._vlques = vlques;
    }
    
   
    public String getCat(){
        return this._vlcat;
    }
     
   
    public void setCat(String vlcat){
        this._vlcat = vlcat;
    }
     
  
    public String getOption1(){
        return this._option1;
    }
    public String getOption2(){
        return this._option2;
    }
    public String getOption3(){
        return this._option3;
    }
    public String getOption4(){
        return this._option4;
    }
    public String getSol(){
        return this._sol;
    }
    public void setSol(String sol){
        this._sol=sol;
    }
  
    public void setOption1(String option1){
        this._option1 = option1;
    }
    public void setOption2(String option2){
        this._option2 = option2;
    }
    public void setOption3(String option3){
        this._option3 = option3;
    }
    public void setOption4(String option4){
        this._option4 = option4;
    }
	

}
