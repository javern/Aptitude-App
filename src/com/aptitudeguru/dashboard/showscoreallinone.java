package com.aptitudeguru.dashboard;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidhive.dashboard.R;

public class showscoreallinone extends Activity {
	TextView t1;
	 double score=0; int k=0;
     int index1=0,index2=0;
     int x=0;
	DatabaseHandler db=new DatabaseHandler(this);
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();

       
        final int ul=bundle.getInt("ul");
       
        if(ul==1)
        {
            setContentView(R.layout.score10);
            
            
            final String ques[]=bundle.getStringArray("ques");
            final String sol1[]=bundle.getStringArray("sol1");
            final String sol2[]=bundle.getStringArray("sol2");
            final String sol3[]=bundle.getStringArray("sol3");
            final String sol4[]=bundle.getStringArray("sol4");
                        
            final int yourans[] = bundle.getIntArray("score");
            final int givenans[]=bundle.getIntArray("givenans");
           // final String cat=bundle.getString("category");
            final int allid[]=bundle.getIntArray("allid");
            final String timetaken=bundle.getString("tt");
        
            TextView timetak=(TextView) findViewById(R.id.textView5);
            TextView incorr=(TextView) findViewById(R.id.textView3);
            TextView unattem=(TextView) findViewById(R.id.textView4);
            
           timetak.append(" "+timetaken);
            int correct=0,incorrect=0,unattempt=0;
            Button btn_score[]=new Button[10];
             btn_score[0] = (Button) findViewById(R.id.score1);
             btn_score[1] = (Button) findViewById(R.id.score2);
            btn_score[2]= (Button) findViewById(R.id.score3);
           btn_score[3] = (Button) findViewById(R.id.score4);
             btn_score[4] = (Button) findViewById(R.id.score5);
             btn_score[5] = (Button) findViewById(R.id.score6);
             btn_score[6] = (Button) findViewById(R.id.score7);
             btn_score[7]= (Button) findViewById(R.id.score8);
             btn_score[8] = (Button) findViewById(R.id.score9);
             btn_score[9] = (Button) findViewById(R.id.score10);
            
            for(int i=0;i<10;i++)
            {
            	if(yourans[index1++] == givenans[index2++])
            	{   
            		score++;
            	}
            }
            t1=(TextView) findViewById(R.id.textView2);
            t1.append((int)score+"");
            
            //storing score with date time
            DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
            Date date = new Date();
     	   String date1=dateFormat.format(date);
     	   String date2=date1+"";
     	   String score2=score+"";
     	  
    //   db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
     	 
     	
     	       
            
          index1=0;
          index2=0;
          for(int i=0;i<10;i++)
          {
          if(yourans[index1]==0)
        	  btn_score[i].setBackgroundColor(Color.BLUE);
          
          else if(yourans[index1]==givenans[index2])
        	  btn_score[i].setBackgroundColor(Color.GREEN);
          else
          {
        	 btn_score[i].setBackgroundColor(Color.RED);
        	 incorrect++;
          }
          
          index1++;
          index2++;
          }
          
      
        
          
          for(int j=0;j<10;j++)
          {
        	final int  x=j;
        	 
 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
  		incorr.append(incorrect+"");
   	int j=(ul*10)-((int)score+incorrect);
   		unattem.append(j+"");
   		double neg1=(((double)(score))-(incorrect*0.25));
   	
   		TextView neg=(TextView) findViewById(R.id.textView6);
   		neg.append(" "+neg1);
   	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));
        }    

        
        

        
        else  if(ul==2)
        { 
             setContentView(R.layout.score20);

             final String ques[]=bundle.getStringArray("ques");
             final String sol1[]=bundle.getStringArray("sol1");
             final String sol2[]=bundle.getStringArray("sol2");
             final String sol3[]=bundle.getStringArray("sol3");
             final String sol4[]=bundle.getStringArray("sol4");
             
             //scoreculate score
      
             //changing background of button
             final int yourans[] = bundle.getIntArray("score");
             final int givenans[]=bundle.getIntArray("givenans");
            // final String cat=bundle.getString("category");
             final int allid[]=bundle.getIntArray("allid");
             final String timetaken=bundle.getString("tt");
         
             TextView timetak=(TextView) findViewById(R.id.textView5);
             TextView incorr=(TextView) findViewById(R.id.textView3);
             TextView unattem=(TextView) findViewById(R.id.textView4);
            timetak.append(" "+timetaken);
             int correct=0,incorrect=0,unattempt=0;
             
             
             
            
             //
             Button btn_score[]=new Button[20];
            for(int i=0;i<20;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	 
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_score[i]= (Button) findViewById(resID);
            	   
            }
            
             
             for(int i=0;i<20;i++)
             {
             	if(yourans[index1++] == givenans[index2++])
             	{   
             		score++;
             	}
             }
             t1=(TextView) findViewById(R.id.textView2);
             t1.append((int)score+"");
             
             //storing score with date time
             DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
             Date date = new Date();
      	   String date1=dateFormat.format(date);
      	   String date2=date1+"";
      	   String score2=score+"";
      	  
      //	  db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
      	  
      	       
          //compressd code
           
           index1=0;
           index2=0;
           for(int i=0;i<20;i++)
           {
           if(yourans[index1]==0)
         	  btn_score[i].setBackgroundColor(Color.BLUE);
           
           else if(yourans[index1]==givenans[index2])
         	  btn_score[i].setBackgroundColor(Color.GREEN);
           else
           {
         	 btn_score[i].setBackgroundColor(Color.RED);
         	 incorrect++;
           }
           
           index1++;
           index2++;
           }
           
       
          for(int j=0;j<20;j++)
          {
        	final int  x=j;
        	 
 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
      	   //e3nd
                		incorr.append(incorrect+"");
     		int j=(ul*10)-((int)score+incorrect);
     		unattem.append(j+"");
     		double neg1=(((double)(score))-(incorrect*0.25));
     	   	
       		TextView neg=(TextView) findViewById(R.id.textView6);
       		neg.append(" "+neg1);

       	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));
        }
        else if(ul==3)
  	  {
  		  setContentView(R.layout.score30);
  		//changing background of button
            final int yourans[] = bundle.getIntArray("score");
            final int givenans[]=bundle.getIntArray("givenans");
           // final String cat=bundle.getString("category");
            final int allid[]=bundle.getIntArray("allid");
            final String timetaken=bundle.getString("tt");
            final String ques[]=bundle.getStringArray("ques");
            final String sol1[]=bundle.getStringArray("sol1");
            final String sol2[]=bundle.getStringArray("sol2");
            final String sol3[]=bundle.getStringArray("sol3");
            final String sol4[]=bundle.getStringArray("sol4");
            TextView timetak=(TextView) findViewById(R.id.textView5);
            TextView incorr=(TextView) findViewById(R.id.textView3);
            TextView unattem=(TextView) findViewById(R.id.textView4);
           timetak.append(" "+timetaken);
            int correct=0,incorrect=0,unattempt=0;
            
            
            
            
            
             Button btn_score[]=new Button[30];
            for(int i=0;i<30;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_score[i]= (Button) findViewById(resID);
            	  
            }
            for(int i=0;i<30;i++)
            {
            	if(yourans[index1++] == givenans[index2++])
            	{   
            		score++;
            	}
            }
            t1=(TextView) findViewById(R.id.textView2);
            t1.append((int)score+"");
            
            //storing score with date time
            DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
            Date date = new Date();
     	   String date1=dateFormat.format(date);
     	   String date2=date1+"";
     	   String score2=score+"";
     //	  
     	 // db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
     	  
     	       
            //compressd code
           
           index1=0;
           index2=0;
           for(int i=0;i<30;i++)
           {
           if(yourans[index1]==0)
         	  btn_score[i].setBackgroundColor(Color.BLUE);
           
           else if(yourans[index1]==givenans[index2])
         	  btn_score[i].setBackgroundColor(Color.GREEN);
           else
           {
         	 btn_score[i].setBackgroundColor(Color.RED);
         	 incorrect++;
           }
           
           index1++;
           index2++;
           }
           
       
          for(int j=0;j<30;j++)
          {
        	final int  x=j;
        	 

 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
      	   //e3nd
    		incorr.append(incorrect+"");
    		int j=(ul*10)-((int)score+incorrect);
    		unattem.append(j+"");
    		double neg1=(((double)(score))-(incorrect*0.25));
    	   	
       		TextView neg=(TextView) findViewById(R.id.textView6);
       		neg.append(" "+neg1);
       	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));

  	  }

        

        else if(ul==4)
        {
        	setContentView(R.layout.score40);
        	//changing background of button
            final int yourans[] = bundle.getIntArray("score");
            final int givenans[]=bundle.getIntArray("givenans");
           // final String cat=bundle.getString("category");
            final int allid[]=bundle.getIntArray("allid");
            final String timetaken=bundle.getString("tt");
            final String ques[]=bundle.getStringArray("ques");
            final String sol1[]=bundle.getStringArray("sol1");
            final String sol2[]=bundle.getStringArray("sol2");
            final String sol3[]=bundle.getStringArray("sol3");
            final String sol4[]=bundle.getStringArray("sol4");
            TextView timetak=(TextView) findViewById(R.id.textView5);
            TextView incorr=(TextView) findViewById(R.id.textView3);
            TextView unattem=(TextView) findViewById(R.id.textView4);
           timetak.append(" "+timetaken);
            int correct=0,incorrect=0,unattempt=0;
            
            
            
            
         Button btn_score[]=new Button[40];
            for(int i=0;i<40;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_score[i]= (Button) findViewById(resID);
            	   
            }
            
            for(int i=0;i<40;i++)
            {
            	if(yourans[index1++] == givenans[index2++])
            	{   
            		score++;
            	}
            }
            t1=(TextView) findViewById(R.id.textView2);
            t1.append((int)score+"");
            
            //storing score with date time
            DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
            Date date = new Date();
     	   String date1=dateFormat.format(date);
     	   String date2=date1+"";
     	   String score2=score+"";
     	  
      //  db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
     	  
           
           index1=0;
           index2=0;
           for(int i=0;i<40;i++)
           {
           if(yourans[index1]==0)
         	  btn_score[i].setBackgroundColor(Color.BLUE);
           
           else if(yourans[index1]==givenans[index2])
         	  btn_score[i].setBackgroundColor(Color.GREEN);
           else
           {
         	 btn_score[i].setBackgroundColor(Color.RED);
         	 incorrect++;
           }
           
           index1++;
           index2++;
           }
           
       
          for(int j=0;j<40;j++)
          {
        	final int  x=j;
        	

 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
      	   //e3nd


     	       
        
    		incorr.append(incorrect+"");
    	int j=(ul*10)-((int)score+incorrect);
    		unattem.append(j+"");
    		double neg1=(((double)(score))-(incorrect*0.25));
    	   	
       		TextView neg=(TextView) findViewById(R.id.textView6);
       		neg.append(" "+neg1);
       	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));

        }
        
        
    	

        else if(ul==5)
        {
        setContentView(R.layout.score50);
       
        final int yourans[] = bundle.getIntArray("score");
        final int givenans[]=bundle.getIntArray("givenans");
       // final String cat=bundle.getString("category");
        final int allid[]=bundle.getIntArray("allid");
        final String timetaken=bundle.getString("tt");
        final String ques[]=bundle.getStringArray("ques");
        final String sol1[]=bundle.getStringArray("sol1");
        final String sol2[]=bundle.getStringArray("sol2");
        final String sol3[]=bundle.getStringArray("sol3");
        final String sol4[]=bundle.getStringArray("sol4");
        TextView timetak=(TextView) findViewById(R.id.textView5);
        TextView incorr=(TextView) findViewById(R.id.textView3);
        TextView unattem=(TextView) findViewById(R.id.textView4);
       timetak.append(" "+timetaken);
        int correct=0,incorrect=0,unattempt=0;
        
        
        
     
 Button btn_score[]=new Button[50];
            for(int i=0;i<50;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	 
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_score[i]= (Button) findViewById(resID);
            	 
            }
        
     
        for(int i=0;i<50;i++)
        {
        	if(yourans[index1++] == givenans[index2++])
        	{   
        		score++;
        	}
        }
        t1=(TextView) findViewById(R.id.textView2);
        t1.append((int)score+"");
        
        //storing score with date time
        DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
        Date date = new Date();
 	   String date1=dateFormat.format(date);
 	   String date2=date1+"";
 	   String score2=score+"";
 	  
 // db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
 	   
 	       
         //compressd code
           
           index1=0;
           index2=0;
           for(int i=0;i<50;i++)
           {
           if(yourans[index1]==0)
         	  btn_score[i].setBackgroundColor(Color.BLUE);
           
           else if(yourans[index1]==givenans[index2])
         	  btn_score[i].setBackgroundColor(Color.GREEN);
           else
           {
         	 btn_score[i].setBackgroundColor(Color.RED);
         	 incorrect++;
           }
           
           index1++;
           index2++;
           }
           
       
          for(int j=0;j<50;j++)
          {
        	final int  x=j;
        	 
 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
      	   //e3nd

   		incorr.append(incorrect+"");
		int j=(ul*10)-((int)score+incorrect);
		unattem.append(j+"");
		double neg1=(((double)(score))-(incorrect*0.25));
	   	
   		TextView neg=(TextView) findViewById(R.id.textView6);
   		neg.append(" "+neg1);
   	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));

        
        }
        


        else if(ul == 6)
        { 
            setContentView(R.layout.score60);
           
            final int yourans[] = bundle.getIntArray("score");
            final int givenans[]=bundle.getIntArray("givenans");
           // final String cat=bundle.getString("category");
            final int allid[]=bundle.getIntArray("allid");
            final String timetaken=bundle.getString("tt");
            final String ques[]=bundle.getStringArray("ques");
            final String sol1[]=bundle.getStringArray("sol1");
            final String sol2[]=bundle.getStringArray("sol2");
            final String sol3[]=bundle.getStringArray("sol3");
            final String sol4[]=bundle.getStringArray("sol4");
            TextView timetak=(TextView) findViewById(R.id.textView5);
            TextView incorr=(TextView) findViewById(R.id.textView3);
            TextView unattem=(TextView) findViewById(R.id.textView4);
           timetak.append(" "+timetaken);
            int correct=0,incorrect=0,unattempt=0;
            
            
            
           
            
          Button btn_score[]=new Button[60];
            for(int i=0;i<60;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_score[i]= (Button) findViewById(resID);
            	   
            }
            index1=0;
            index2=0;
            for(int i=0;i<60;i++)
            {
            	if(yourans[index1++] == givenans[index2++])
            	{   
            		score++;
            	}
            }
            t1=(TextView) findViewById(R.id.textView2);
            t1.append((int)score+"");
            
            //storing score with date time
            DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
            Date date = new Date();
     	   String date1=dateFormat.format(date);
     	   String date2=date1+"";
     	   String score2=score+"";
     	  
    //db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
     	 
     	       
          //compressd code
           
           index1=0;
           index2=0;
           for(int i=0;i<60;i++)
           {
           if(yourans[index1]==0)
         	  btn_score[i].setBackgroundColor(Color.BLUE);
           
           else if(yourans[index1]==givenans[index2])
         	  btn_score[i].setBackgroundColor(Color.GREEN);
           else
           {
         	 btn_score[i].setBackgroundColor(Color.RED);
         	 incorrect++;
           }
           
           index1++;
           index2++;
           }
           
       
          for(int j=0;j<60;j++)
          {
        	final int  x=j;
        	 

 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
      	   //e3nd


    		incorr.append(incorrect+"");
    		int j=(ul*10)-((int)score+incorrect);
    		unattem.append(j+"");
    		double neg1=(((double)(score))-(incorrect*0.25));
    	   	
       		TextView neg=(TextView) findViewById(R.id.textView6);
       		neg.append(" "+neg1);
       	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));

        }

        
        


        else if(ul == 7)
        {
            setContentView(R.layout.score70);
            final int yourans[] = bundle.getIntArray("score");
            final int givenans[]=bundle.getIntArray("givenans");
           // final String cat=bundle.getString("category");
            final int allid[]=bundle.getIntArray("allid");
            final String timetaken=bundle.getString("tt");
            final String ques[]=bundle.getStringArray("ques");
            final String sol1[]=bundle.getStringArray("sol1");
            final String sol2[]=bundle.getStringArray("sol2");
            final String sol3[]=bundle.getStringArray("sol3");
            final String sol4[]=bundle.getStringArray("sol4");
            TextView timetak=(TextView) findViewById(R.id.textView5);
            TextView incorr=(TextView) findViewById(R.id.textView3);
            TextView unattem=(TextView) findViewById(R.id.textView4);
           timetak.append(" "+timetaken);
            int correct=0,incorrect=0,unattempt=0;
             Button btn_score[]=new Button[70];
            for(int i=0;i<70;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_score[i]= (Button) findViewById(resID);
            	    
            }
            
            
            
            
      
       
            index1=0;
            index2=0;
            for(int i=0;i<(70);i++)
            {
            	if(yourans[index1++] == givenans[index2++])
            	{   
            		score++;
            	}
            }
            t1=(TextView) findViewById(R.id.textView2);
            t1.append((int)score+"");
            
            //storing score with date time
            DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
            Date date = new Date();
     	   String date1=dateFormat.format(date);
     	   String date2=date1+"";
     	   String score2=score+"";
     	  
  // db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
     	  
           index1=0;
           index2=0;
           for(int i=0;i<70;i++)
           {
           if(yourans[index1]==0)
         	  btn_score[i].setBackgroundColor(Color.BLUE);
           
           else if(yourans[index1]==givenans[index2])
         	  btn_score[i].setBackgroundColor(Color.GREEN);
           else
           {
         	 btn_score[i].setBackgroundColor(Color.RED);
         	 incorrect++;
           }
           
           index1++;
           index2++;
           }
           
       
          for(int j=0;j<70;j++)
          {
        	final int  x=j;
        	 

 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
      	   //e3nd

            
          
    		incorr.append(incorrect+"");
    int j=(ul*10)-((int)score+incorrect);
    		unattem.append(j+"");
    		double neg1=(((double)(score))-(incorrect*0.25));
    	   	
       		TextView neg=(TextView) findViewById(R.id.textView6);
       		neg.append(" "+neg1);
       	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));

            
            }
        

        else if(ul==8)
        {
            setContentView(R.layout.score80);
            final int yourans[] = bundle.getIntArray("score");
            final int givenans[]=bundle.getIntArray("givenans");
           // final String cat=bundle.getString("category");
            final int allid[]=bundle.getIntArray("allid");
            final String timetaken=bundle.getString("tt");
        
            TextView timetak=(TextView) findViewById(R.id.textView5);
            TextView incorr=(TextView) findViewById(R.id.textView3);
            TextView unattem=(TextView) findViewById(R.id.textView4);
           timetak.append(" "+timetaken);
            int correct=0,incorrect=0,unattempt=0;
            final String ques[]=bundle.getStringArray("ques");
            final String sol1[]=bundle.getStringArray("sol1");
            final String sol2[]=bundle.getStringArray("sol2");
            final String sol3[]=bundle.getStringArray("sol3");
            final String sol4[]=bundle.getStringArray("sol4");
             Button btn_score[]=new Button[80];
            for(int i=0;i<80;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_score[i]= (Button) findViewById(resID);
            	   
            }
            for(int i=0;i<80;i++)
            {
            	if(yourans[index1++] == givenans[index2++])
            	{   
            		score++;
            	}
            }
            t1=(TextView) findViewById(R.id.textView2);
            t1.append((int)score+"");
            
            //storing score with date time
            DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
            Date date = new Date();
     	   String date1=dateFormat.format(date);
     	   String date2=date1+"";
     	   String score2=score+"";
     	  
     //  db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
     	 
     	
     	       
           
           index1=0;
           index2=0;
           for(int i=0;i<80;i++)
           {
           if(yourans[index1]==0)
         	  btn_score[i].setBackgroundColor(Color.BLUE);
           
           else if(yourans[index1]==givenans[index2])
         	  btn_score[i].setBackgroundColor(Color.GREEN);
           else
           {
         	 btn_score[i].setBackgroundColor(Color.RED);
         	 incorrect++;
           }
           
           index1++;
           index2++;
           }
           
       
          for(int j=0;j<80;j++)
          {
        	final int  x=j;
        	 

 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
      	   //e3nd


           		incorr.append(incorrect+"");
    	int j=(ul*10)-((int)score+incorrect);
    		unattem.append(j+"");
    		double neg1=(((double)(score))-(incorrect*0.25));
    	   	
       		TextView neg=(TextView) findViewById(R.id.textView6);
       		neg.append(" "+neg1);
       	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));
            
            }

        

        else if(ul==9)
        {
            setContentView(R.layout.score90);
            final int yourans[] = bundle.getIntArray("score");
            final int givenans[]=bundle.getIntArray("givenans");
           // final String cat=bundle.getString("category");
            final int allid[]=bundle.getIntArray("allid");
            final String timetaken=bundle.getString("tt");
        
            TextView timetak=(TextView) findViewById(R.id.textView5);
            TextView incorr=(TextView) findViewById(R.id.textView3);
            TextView unattem=(TextView) findViewById(R.id.textView4);
           timetak.append(" "+timetaken);
            int correct=0,incorrect=0,unattempt=0;
            final String ques[]=bundle.getStringArray("ques");
            final String sol1[]=bundle.getStringArray("sol1");
            final String sol2[]=bundle.getStringArray("sol2");
            final String sol3[]=bundle.getStringArray("sol3");
            final String sol4[]=bundle.getStringArray("sol4");
            
            
            
             Button btn_score[]=new Button[90];
            for(int i=0;i<90;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	   int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_score[i]= (Button) findViewById(resID);
            	   
            }
            for(int i=0;i<90;i++)
            {
            	if(yourans[index1++] == givenans[index2++])
            	{   
            		score++;
            	}
            }
            t1=(TextView) findViewById(R.id.textView2);
            t1.append((int)score+"");
            
            //storing score with date time
            DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
            Date date = new Date();
     	   String date1=dateFormat.format(date);
     	   String date2=date1+"";
     	   String score2=score+"";
     	  
    //   db.addSbtable(new sbtable("allinone","allinone",date2,score2,timetaken));
     	 
     	
     	       
        
          //compressd code
           
           index1=0;
           index2=0;
           for(int i=0;i<90;i++)
           {
           if(yourans[index1]==0)
         	  btn_score[i].setBackgroundColor(Color.BLUE);
           
           else if(yourans[index1]==givenans[index2])
         	  btn_score[i].setBackgroundColor(Color.GREEN);
           else
           {
         	 btn_score[i].setBackgroundColor(Color.RED);
         	 incorrect++;
           }
           
           index1++;
           index2++;
           }
           
       
          for(int j=0;j<90;j++)
          {
        	final int  x=j;
        	

 		       
    			
			final	String id=allid[x]+"";
			final	String current=x+"";
          btn_score[j].setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View view) {
  				
  				
  				Intent intent=new Intent(getApplicationContext(),Resultallinone.class);
  				   intent.putExtra("ComingFrom",id);
  				   intent.putExtra("current",current);
  				 //   
  				   intent.putExtra("yourans", yourans);
  				   intent.putExtra("givenans", givenans);
  				   intent.putExtra("allid", allid); 
  				 intent.putExtra("current",current);  
  		                intent.putExtra("ques", ques);
  				 intent.putExtra("sol1", sol1);
  				 intent.putExtra("sol2", sol2);
  				 intent.putExtra("sol3", sol3);
  				 intent.putExtra("sol4", sol4);
  				   
  				 k++;
  				  // setResultallinone(Resultallinone_OK, intent);
  				intent.putExtra("ul",ul);
  				   intent.putExtra("ul",ul); 
  				   startActivity(intent);
  				   
  				
  			}
  		});
          }
   
      	   //e3nd


  


    		incorr.append(incorrect+"");
    	int j=(ul*10)-((int)score+incorrect);
    		unattem.append(j+"");
    		double neg1=(((double)(score))-(incorrect*0.25));
    	   	
       		TextView neg=(TextView) findViewById(R.id.textView6);
       		neg.append(" "+neg1);
       	  db.addSbtable(new sbtable("allinone","allinone",date2,(neg1+""),timetaken));

        }
       
        

       
        
        
        
   Button btn_home = (Button) findViewById(R.id.btn_home);
        
        // Dashboard Friends button
        Button btn_fav = (Button) findViewById(R.id.btn_fav);
        
        // Dashboard Messages button
        Button btn_score = (Button) findViewById(R.id.btn_score);
        
        // Dashboard Places button
        Button btn_tutorial = (Button) findViewById(R.id.btn_soundon);
        
        // Dashboard Events button
        Button btn_about = (Button) findViewById(R.id.btn_about);
        
       
        
        /**
         * Handling all button click events
         */
        
        // Listening to News Feed button click
          btn_home.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), AndroidDashboardDesignActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});
        
       // Listening Friends button click
        btn_fav.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), FavPage.class);
				
				startActivity(i);
			}
		});
        
        // Listening Messages button click
        btn_score.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), scoremenu.class);
				startActivity(i);
			}
		});
        
        // Listening to Places button click
        btn_tutorial.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(),Tutorialpage.class);
				startActivity(i);
			}
		});
        
        // Listening to Events button click
        btn_about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), AboutUs.class);
				startActivity(i);
			}
		});
  
 	   
Button btn_help = (Button) findViewById(R.id.btn_help);
		
		btn_help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(),
					Help.class);

				startActivity(i);
			}
		});

       
        
	}
	 @Override
		public void onBackPressed()
		{
		 Intent i = new Intent(getApplicationContext(),AndroidDashboardDesignActivity.class);
			i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
		}
}
