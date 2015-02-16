package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;


public class scoremenu extends Activity {
	Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scoremenu);
		
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

	
		Button btn_quants = (Button) findViewById(R.id.btn_score_quants);
		Button btn_vl = (Button) findViewById(R.id.btn_score_verbal);
		Button btn_c= (Button) findViewById(R.id.btn_score_c);
		Button btn_cpp = (Button) findViewById(R.id.btn_score_cpp);
		Button btn_java = (Button) findViewById(R.id.btn_score_java);
		Button btn_os = (Button) findViewById(R.id.btn_score_os);
		Button btn_dbms = (Button) findViewById(R.id.btn_score_dbms);
		Button btn_dsa = (Button) findViewById(R.id.btn_score_datastructure);
		Button btn_html = (Button) findViewById(R.id.btn_score_html);
		Button btn_allinone = (Button) findViewById(R.id.btn_score_allinone);

		btn_quants.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(),
						quantsscore.class);
				startActivity(i);
			}
		});
		btn_vl.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(), vlscore.class);
				startActivity(i);
			}
		});
		btn_c.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(), cscore.class);
				startActivity(i);
			}
		});
		btn_java.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(), javascore.class);
				startActivity(i);
			}
		});

		btn_cpp.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(), cppscore.class);
				startActivity(i);
			}
		});

		btn_os.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String cat="os";
				
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat",cat);
				
				startActivity(i);
			}
		});
		btn_dbms.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String cat="dbms";
				
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat",cat);
				
				startActivity(i);
			}
		});

		btn_dsa.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String cat="dsa";
				
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat",cat);
				
				startActivity(i);
			}
		});

		btn_html.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String cat="html";
				
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat",cat);
				
				startActivity(i);
			}
		});
		btn_allinone.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String cat="allinone";
				
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat",cat);
				
				startActivity(i);
			}
		});

	}

}
