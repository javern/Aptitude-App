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
public class showscoredsa extends Activity {
	TextView t1;
	int correct=0,incorrect=0,unattempt=0;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_score);
        DatabaseHandler db=new DatabaseHandler(this);
   Button btn_home = (Button) findViewById(R.id.btn_home);
        
      
        Button btn_fav = (Button) findViewById(R.id.btn_fav);
        
      
        Button btn_score = (Button) findViewById(R.id.btn_score);
        
        
        Button btn_tutorial = (Button) findViewById(R.id.btn_soundon);
        
        
        Button btn_about = (Button) findViewById(R.id.btn_about);
Button btn_help = (Button) findViewById(R.id.btn_help);
		
		btn_help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
					Help.class);

				startActivity(i);
			}
		});

        
       
        
       
           btn_home.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), AndroidDashboardDesignActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});
        
      
        btn_fav.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), FavPage.class);
				
				startActivity(i);
			}
		});
        
      
        btn_score.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
			
				Intent i = new Intent(getApplicationContext(), scoremenu.class);
				startActivity(i);
			}
		});
        
       
        btn_tutorial.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),Tutorialpage.class);
				startActivity(i);
			}
		});
      
        btn_about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), AboutUs.class);
				startActivity(i);
			}
		});
        
        Bundle bundle = getIntent().getExtras();
        final int yourans[] = bundle.getIntArray("score");
        final int givenans[]=bundle.getIntArray("givenans");
        final String cat=bundle.getString("category");
        final int allid[]=bundle.getIntArray("allid");
        
        final String timetaken=bundle.getString("tt");
        TextView timetak=(TextView) findViewById(R.id.textView5);
        TextView incorr=(TextView) findViewById(R.id.textView3);
        TextView unattem=(TextView) findViewById(R.id.textView4);
        timetak.append(" "+timetaken);
        
        

      
        int score=0;
        int index1=0,index2=0;
      
        
   
        
        Button btn_score1 = (Button) findViewById(R.id.score1);
        Button btn_score2 = (Button) findViewById(R.id.score2);
        Button btn_score3 = (Button) findViewById(R.id.score3);
        Button btn_score4 = (Button) findViewById(R.id.score4);
        Button btn_score5 = (Button) findViewById(R.id.score5);
        Button btn_score6 = (Button) findViewById(R.id.score6);
        Button btn_score7 = (Button) findViewById(R.id.score7);
        Button btn_score8 = (Button) findViewById(R.id.score8);
        Button btn_score9 = (Button) findViewById(R.id.score9);
        Button btn_score10 = (Button) findViewById(R.id.score10);
        Button btn_score11 = (Button) findViewById(R.id.score11);
        Button btn_score12 = (Button) findViewById(R.id.score12);
        Button btn_score13 = (Button) findViewById(R.id.score13);
        Button btn_score14 = (Button) findViewById(R.id.score14);
        Button btn_score15 = (Button) findViewById(R.id.score15);
        Button btn_score16 = (Button) findViewById(R.id.score16);
        Button btn_score17 = (Button) findViewById(R.id.score17);
        Button btn_score18 = (Button) findViewById(R.id.score18);
        Button btn_score19 = (Button) findViewById(R.id.score19);
        Button btn_score20= (Button) findViewById(R.id.score20);
        
        for(int i=0;i<20;i++)
        {
        	if(yourans[index1++] == givenans[index2++])
        	{   
        		score++;
        	}
        }
        
        
        
        t1=(TextView) findViewById(R.id.textView2);
        t1.append(score+"/20");
        
        //storing score with date time
      DateFormat dateFormat = new SimpleDateFormat("dd/MM  HH:mm");
        Date date = new Date();
 	   String date1=dateFormat.format(date);
 	   String date2=date1+"";
 	   String score2=score+"";
 	   db.addSbtable(new sbtable("dsa","dsa",date2,score2,timetaken));
 	           index1=0;
        index2=0;
        if(yourans[index1]==0)
      	  btn_score1.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score1.setBackgroundColor(Color.GREEN);
        else
        {
      	 btn_score1.setBackgroundColor(Color.RED);
      	 incorrect++;
        }
        
        index1++;
        index2++;
        
        if(yourans[index1]==0)
      	  btn_score2.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score2.setBackgroundColor(Color.GREEN);
        else
        {
      	 btn_score2.setBackgroundColor(Color.RED);
        incorrect++;
      }
        
        
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score3.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score3.setBackgroundColor(Color.GREEN);
        else
        {
      	 btn_score3.setBackgroundColor(Color.RED);
        incorrect++;
      }
        index1++;
        
        index2++;
        
        if(yourans[index1]==0)
      	  btn_score4.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score4.setBackgroundColor(Color.GREEN);
        else
        {
       	 btn_score4.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score5.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score5.setBackgroundColor(Color.GREEN);
        else
        {
       	 btn_score5.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score6.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score6.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score6.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score7.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score7.setBackgroundColor(Color.GREEN);
        else
        {
       	 btn_score7.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score8.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score8.setBackgroundColor(Color.GREEN);
        else
        {
       	 btn_score8.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score9.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score9.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score9.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score10.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score10.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score10.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score11.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score11.setBackgroundColor(Color.GREEN);
        else
        {
       	 btn_score11.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score12.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score12.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score12.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        
        if(yourans[index1]==0)
      	  btn_score13.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score13.setBackgroundColor(Color.GREEN);
        else
        {
       	 btn_score13.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score14.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score14.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score14.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score15.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score15.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score15.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score16.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score16.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score16.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score17.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score17.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score17.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score18.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score18.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score18.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score19.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score19.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score19.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
        if(yourans[index1]==0)
      	  btn_score20.setBackgroundColor(Color.BLUE);
        
        else if(yourans[index1]==givenans[index2])
      	  btn_score20.setBackgroundColor(Color.GREEN);
        else
          
        {
       	 btn_score20.setBackgroundColor(Color.RED);
         incorrect++;
       }
        index1++;
        
        index2++;
      btn_score1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[0]+"";
				String current=0+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("current",current);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				  // setResultdsa(Resultdsa_OK, intent);
				   startActivity(intent);
				  
			}
		});
    
      btn_score2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[1]+"";
				String current=1+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				  // setResultdsa(Resultdsa_OK, intent);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
				  
			}
		});
      btn_score3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[2]+"";
				String current=2+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				 //  setResultdsa(Resultdsa_OK, intent);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
      btn_score4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[3]+"";
				String current=3+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				      intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[4]+"";
				String current=4+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[5]+"";
				String current=5+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[6]+"";
				String current=6+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[7]+"";
				String current=7+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[8]+"";
				String current=8+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   startActivity(intent);
			}
		});
		btn_score10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[9]+"";
				String current=9+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   startActivity(intent);
			}
		});
		btn_score11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[10]+"";
				String current=10+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[11]+"";
				String current=11+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score13.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[12]+"";
				String current=12+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("allid", allid);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[13]+"";
				String current=13+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score15.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[14]+"";
				String current=14+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score16.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[15]+"";
				String current=15+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score17.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[16]+"";
				String current=16+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score18.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[17]+"";
				String current=17+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});btn_score19.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[18]+"";
				String current=18+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		});
		btn_score20.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				String id=allid[19]+"";
				String current=19+"";
				Intent intent=new Intent(getApplicationContext(),Resultdsa.class);
				   intent.putExtra("ComingFrom",id);
				   intent.putExtra("Category",cat);
				   intent.putExtra("yourans", yourans);
				   intent.putExtra("givenans", givenans);
				   intent.putExtra("allid", allid);
				   intent.putExtra("current",current);
				   startActivity(intent);
			}
		
	});
		incorr.append(incorrect+"");
		int j=20-(score+incorrect);
		unattem.append(j+"");
}
}
