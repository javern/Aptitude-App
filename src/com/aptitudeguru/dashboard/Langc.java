package com.aptitudeguru.dashboard;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class Langc extends Language {
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
		setContentView(R.layout.app_c);
	
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
	
		Button btn_c1 = (Button) findViewById(R.id.btn_c1);
		buttonCommon(btn_c1, "c1");
	
		Button btn_c2 = (Button) findViewById(R.id.btn_c2);
		buttonCommon(btn_c2, "c2");
	
		Button btn_c4 = (Button) findViewById(R.id.btn_c4);
		buttonCommon(btn_c4, "c4");
		
		Button btn_c5 = (Button) findViewById(R.id.btn_c5);
		buttonCommon(btn_c5, "c5");
		
		Button btn_c6 = (Button) findViewById(R.id.btn_c6);
		buttonCommon(btn_c6, "c6");
	
		Button btn_c7 = (Button) findViewById(R.id.btn_c7);
		buttonCommon(btn_c7, "c7");
	
		Button btn_c8 = (Button) findViewById(R.id.btn_c8);
		buttonCommon(btn_c8, "c8");
	
		Button btn_c9 = (Button) findViewById(R.id.btn_c9);
		buttonCommon(btn_c9, "c9");
		
		Button btn_c10 = (Button) findViewById(R.id.btn_c10);
		buttonCommon(btn_c10, "c10");
		
		Button btn_c11 = (Button) findViewById(R.id.btn_c11);
		buttonCommon(btn_c11, "c11");
	
		Button btn_c12 = (Button) findViewById(R.id.btn_c12);
		buttonCommon(btn_c12, "c12");
	
		Button btn_c13 = (Button) findViewById(R.id.btn_c13);
		buttonCommon(btn_c13, "c13");
	
		Button btn_c14 = (Button) findViewById(R.id.btn_c14);
		buttonCommon(btn_c14, "c14");
		
		
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
	
		Intent i = new Intent(getApplicationContext(), TestPagec.class);
		i.putExtra("cat", cat);
			startActivity(i);
		}
}





