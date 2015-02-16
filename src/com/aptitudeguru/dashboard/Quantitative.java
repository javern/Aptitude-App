package com.aptitudeguru.dashboard;

import android.app.Activity;

import android.content.Context;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidhive.dashboard.R;

public class Quantitative extends Activity {

	int start = 1;
	 final Context context = this;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) { 
	        // Activity was brought to front and not created, 
	        // Thus finishing this will get us to the last viewed activity 
	        finish(); 
	        return; 
	    } 
		setContentView(R.layout.news_feed_layout);

		
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
				
				Intent i = new Intent(getApplicationContext(),
						AndroidDashboardDesignActivity.class);
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
				
				Intent i = new Intent(getApplicationContext(),
						Tutorialpage.class);
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

		
		Button btn_q1 = (Button) findViewById(R.id.btn_q1);

		
		btn_q1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
						String cat = "q1";
						
						Intent i = new Intent(getApplicationContext(), TestPage.class);
						i.putExtra("cat", cat);

						startActivity(i);
				

			}
		});

		
		Button btn_q2 = (Button) findViewById(R.id.btn_q2);

		
		btn_q2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q2";

				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);

				startActivity(i);
			}
		});

		
		Button btn_q4 = (Button) findViewById(R.id.btn_q4);

	
		btn_q4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			
				String cat = "q4";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q5 = (Button) findViewById(R.id.btn_q5);

		
		btn_q5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				String cat = "q5";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q6 = (Button) findViewById(R.id.btn_q6);

		
		btn_q6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q6";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q7 = (Button) findViewById(R.id.btn_q7);

	
		btn_q7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q7";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q8 = (Button) findViewById(R.id.btn_q8);

		
		btn_q8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q8";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q10 = (Button) findViewById(R.id.btn_q10);

		
		btn_q10.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q10";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q11 = (Button) findViewById(R.id.btn_q11);

	
		btn_q11.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			
				String cat = "q11";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

	
		Button btn_q12 = (Button) findViewById(R.id.btn_q12);

		
		btn_q12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q12";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q13 = (Button) findViewById(R.id.btn_q13);

		
		btn_q13.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q13";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q15 = (Button) findViewById(R.id.btn_q15);

		btn_q15.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q15";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});
		
		Button btn_q16 = (Button) findViewById(R.id.btn_q16);

		
		btn_q16.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q16";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		
		Button btn_q17 = (Button) findViewById(R.id.btn_q17);

		
		btn_q17.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "q17";
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

	}

}
