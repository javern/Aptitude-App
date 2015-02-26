package com.aptitudeguru.dashboard;

import java.util.List;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidhive.dashboard.R;

public class TestScore extends Activity {

	String y1[];
	TextView t1, t2, t3, t4;
	String cat="";
	TextView t5;
	DatabaseHandler db = new DatabaseHandler(this);
	TableLayout prodlist;
	private static final int DIVIDER_SIZE = 2;
	
	void display(String datetime, String timetaken, String score) {
		View divider;
		TableRow tr2 = new TableRow(this);
		tr2.layout(0, 0, 0, 0);

		TextView lbldt = new TextView(this);
		lbldt.setText("" + datetime);
		lbldt.setTextColor(Color.BLACK);
		lbldt.setGravity(Gravity.CENTER);
		lbldt.setTextSize((float) 16);
		lbldt.setBackgroundColor(Color.LTGRAY);
		lbldt.setTypeface(null, 1);
		//lbldt.setBackgroundColor(Color.TRANSPARENT);
		lbldt.setPadding(30, 0, 0, 0);


		tr2.setPadding(0, 1, 0, 0);
		tr2.addView(lbldt);

		divider = new View(this);
		divider.setLayoutParams(new TableLayout.LayoutParams(
				DIVIDER_SIZE, TableLayout.LayoutParams.MATCH_PARENT));
		divider.setBackgroundColor(Color.BLACK);
		tr2.addView(divider, new TableRow.LayoutParams(
				DIVIDER_SIZE, TableRow.LayoutParams.MATCH_PARENT));
		TextView lbltt = new TextView(this);
		lbltt.setText("" + timetaken);
		lbltt.setTextColor(Color.BLACK);
		lbltt.setTextSize((float) 16);
		lbltt.setBackgroundColor(Color.LTGRAY);
		lbltt.setGravity(Gravity.CENTER);
		lbltt.setTypeface(null, 1);
		// lbltt.setBackgroundColor(Color.TRANSPARENT);
		lbltt.setPadding(30, 0, 20, 0);
		tr2.setPadding(0, 1, 0, 1);
		tr2.addView(lbltt);

		divider = new View(this);
		divider.setLayoutParams(new TableLayout.LayoutParams(
				DIVIDER_SIZE, TableLayout.LayoutParams.MATCH_PARENT));
		divider.setBackgroundColor(Color.BLACK);
		tr2.addView(divider, new TableRow.LayoutParams(
				DIVIDER_SIZE, TableRow.LayoutParams.MATCH_PARENT));

		TextView lblsc = new TextView(this);
		lblsc.setText("" + score);
		lblsc.setTextColor(Color.BLACK);
		lblsc.setBackgroundColor(Color.LTGRAY);
		lblsc.setTextSize((float) 16);
		lblsc.setTypeface(null, 1);

		lblsc.setGravity(Gravity.CENTER);
		//lblsc.setBackgroundColor(Color.TRANSPARENT);
		lblsc.setPadding(30, 0, 20, 0);
		tr2.setPadding(0, 1, 0, 1);
		tr2.addView(lblsc);

		divider = new View(this);
		divider.setLayoutParams(new TableLayout.LayoutParams(
				DIVIDER_SIZE, TableLayout.LayoutParams.MATCH_PARENT));
		divider.setBackgroundColor(Color.BLACK);
		tr2.addView(divider, new TableRow.LayoutParams(
				DIVIDER_SIZE, TableRow.LayoutParams.MATCH_PARENT));
		prodlist.addView(tr2, new TableLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

	}



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.testscore);

		prodlist = (TableLayout) findViewById(R.id.tbl_product);
		t5=(TextView) findViewById(R.id.dispcat);
		Bundle bundle = getIntent().getExtras();
		cat = bundle.getString("cat");

		int index = 0;

		//int j = 0;
		List<sbtable> quants = db.getAllsbtable(cat);
		if (quants.isEmpty()) {

			t5.setText("You Have Not Yet Appered For Any Test");

		} else {
			y1 = new String[quants.size()];


			index = 0;
			display("Date & Time", "Time", "Score");
			for (sbtable cn : quants) {


				int id = cn.getID();

				String sec = cn.getSection();
				String subsec = cn.getSubsection();
				String dte1 = cn.getDatetime();
				String score1 = cn.getScore();
				String tt = cn.gettt();
				//int sco = Integer.parseInt(score1);
				y1[index++] = score1;



				display(dte1, tt, score1);



			}

		}



		Button btn_tutorial = (Button) findViewById(R.id.btn_delete);
		btn_tutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen

				List<sbtable> quants1 = db.getAllsbtable(cat);
				if (quants1.isEmpty()) {


				} else {


					for (sbtable cn1 : quants1) {
						db.deletesb(cn1);

					}

					prodlist.setVisibility(View.INVISIBLE);
				}
			}
		});
		Button btn_home = (Button) findViewById(R.id.btn_home);

		// Dashboard Friends button
		Button btn_fav = (Button) findViewById(R.id.btn_fav);

		// Dashboard Messages button
		Button btn_score = (Button) findViewById(R.id.btn_score);

		// Dashboard Places button

		// Dashboard Events button
		Button btn_about = (Button) findViewById(R.id.btn_about);
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

		/**
		 * Handling all button click events
		 * */

		// Listening to News Feed button click
		btn_home.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(),
						AndroidDashboardDesignActivity.class);
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


		// Listening to Events button click
		btn_about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(),
						AboutUs.class);
				startActivity(i);
			}
		});


	}
}
