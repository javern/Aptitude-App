package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class Verbal extends Activity {
	
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
		setContentView(R.layout.messages_layout);

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

		Button btn_v1 = (Button) findViewById(R.id.btn_v1);
		buttonCommon(btn_v1, "v1");

		Button btn_v2 = (Button) findViewById(R.id.btn_v2);
		buttonCommon(btn_v2, "v2");

		Button btn_v3 = (Button) findViewById(R.id.btn_v3);
		buttonCommon(btn_v3, "v3");

		Button btn_v4 = (Button) findViewById(R.id.btn_v4);
		buttonCommon(btn_v4, "v4");

		Button btn_v5 = (Button) findViewById(R.id.btn_v5);
		buttonCommon(btn_v5, "v5");

		Button btn_v6 = (Button) findViewById(R.id.btn_v6);
		buttonCommon(btn_v6, "v6");

		Button btn_v7 = (Button) findViewById(R.id.btn_v7);
		buttonCommon(btn_v7, "v7");
		
		

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

		Intent i = new Intent(getApplicationContext(), TestPagevl.class);
		i.putExtra("cat", cat);
		startActivity(i);
	}
}


