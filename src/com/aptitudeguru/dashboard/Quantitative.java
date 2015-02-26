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
				Intent i = new Intent(getApplicationContext(), Help.class);
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
				Intent i = new Intent(getApplicationContext(), Tutorialpage.class);
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
		buttonCommon(btn_q1, "q1");

		Button btn_q2 = (Button) findViewById(R.id.btn_q2);
		buttonCommon(btn_q2, "q2");

		Button btn_q4 = (Button) findViewById(R.id.btn_q4);
		buttonCommon(btn_q4, "q4");

		Button btn_q5 = (Button) findViewById(R.id.btn_q5);
		buttonCommon(btn_q5, "q5");

		Button btn_q6 = (Button) findViewById(R.id.btn_q6);
		buttonCommon(btn_q6, "q6");

		Button btn_q7 = (Button) findViewById(R.id.btn_q7);
		buttonCommon(btn_q7, "q7");

		Button btn_q8 = (Button) findViewById(R.id.btn_q8);
		buttonCommon(btn_q8, "q8");
		
		Button btn_q10 = (Button) findViewById(R.id.btn_q10);
		buttonCommon(btn_q10, "q10");

		Button btn_q11 = (Button) findViewById(R.id.btn_q11);
		buttonCommon(btn_q11, "q11");

		Button btn_q12 = (Button) findViewById(R.id.btn_q12);
		buttonCommon(btn_q12, "q12");

		Button btn_q13 = (Button) findViewById(R.id.btn_q13);
		buttonCommon(btn_q13, "q13");

		Button btn_q15 = (Button) findViewById(R.id.btn_q15);
		buttonCommon(btn_q15, "q15");

		Button btn_q16 = (Button) findViewById(R.id.btn_q16);
		buttonCommon(btn_q16, "q16");

		Button btn_q17 = (Button) findViewById(R.id.btn_q17);		
		buttonCommon(btn_q17, "q17");
	}
	
	public void buttonCommon(Button button, final String t) {
		Button btn = button;

		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				startActivityCommon(t);
			}
		});
	}

	public void startActivityCommon(String temp) {
		String cat = temp;

		Intent i = new Intent(getApplicationContext(), TestPage.class);
		i.putExtra("cat", cat);
		startActivity(i);
	}
}