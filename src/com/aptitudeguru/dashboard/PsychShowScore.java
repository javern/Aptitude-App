package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidhive.dashboard.R;

public class PsychShowScore extends Activity {
	TextView t1;
	DatabaseHandler db=new DatabaseHandler(this);
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.psych_show_score);
        int correct=0,incorrect=0,unattempt=0;
        
        
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
        TextView givenAnswers = (TextView) findViewById(R.id.psychGivenAnswers);
        givenAnswers.append(bundle.getString("ans"));
        
        Button btn_score1 = (Button) findViewById(R.id.score1);
	}
}
