package com.aptitudeguru.dashboard;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidhive.dashboard.R;

public class cppscore extends Activity {
	int y1[];
	TextView t1, t2, t3, t4;
	DatabaseHandler db = new DatabaseHandler(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_cpp);

		Button btn_home = (Button) findViewById(R.id.btn_home);

		Button btn_fav = (Button) findViewById(R.id.btn_fav);
		
		Button btn_score = (Button) findViewById(R.id.btn_score);
		
		Button btn_tutorial = (Button) findViewById(R.id.btn_soundon);
		
		Button btn_help = (Button) findViewById(R.id.btn_help);
		
		btn_help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), Help.class);

				startActivity(i);
			}
		});

		
		Button btn_about = (Button) findViewById(R.id.btn_about);

		
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
		
		Button btn_cpp1 = (Button) findViewById(R.id.btn_cpp1);
		ScoreButtonCommon(btn_cpp1, "cpp1");
	
		Button btn_cpp2 = (Button) findViewById(R.id.btn_cpp2);
		ScoreButtonCommon(btn_cpp2, "cpp2");
		
		Button btn_cpp3 = (Button) findViewById(R.id.btn_cpp3);
		ScoreButtonCommon(btn_cpp3, "cpp3");
	
		Button btn_cpp4 = (Button) findViewById(R.id.btn_cpp4);
		ScoreButtonCommon(btn_cpp4, "cpp4");
		
		Button btn_cpp5 = (Button) findViewById(R.id.btn_cpp5);
		ScoreButtonCommon(btn_cpp5, "cpp5");
		
		Button btn_cpp6 = (Button) findViewById(R.id.btn_cpp6);
		ScoreButtonCommon(btn_cpp6, "cpp6");
	
		Button btn_cpp7 = (Button) findViewById(R.id.btn_cpp7);
		ScoreButtonCommon(btn_cpp7, "cpp7");
		
		
	}
	
	public void ScoreButtonCommon(Button btn, final String t) {
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				QScoreCommon(t);
			}
		});
	}
	
	public void QScoreCommon(String temp) {
		String cat = temp;
		Intent i = new Intent(getApplicationContext(), TestScore.class);
		i.putExtra("cat", cat);
		startActivity(i);		
	}
}
