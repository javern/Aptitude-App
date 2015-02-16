package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidhive.dashboard.R;

public class Calender extends Activity {
	String PUBLIC_STATIC_STRING_IDENTIFIER;
	int gotoclick[] = new int[20];
	int click=0;

	@Override
	public void onBackPressed()
	{
		String id = click + "";
		Log.d("click--id:",id);
		// Launching News Feed Screen

		Intent intent = new Intent(getApplicationContext(),
				TestPage.class);
		intent.putExtra("ComingFrom", id);
		setResult(RESULT_OK, intent);
		finish();
		
	
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calender);

		Bundle bundle = getIntent().getExtras();
		gotoclick = bundle.getIntArray("gotoclick");
		  click=bundle.getInt("click");

		Button btn_cal1 = (Button) findViewById(R.id.cal1);
		Button btn_cal2 = (Button) findViewById(R.id.cal2);
		Button btn_cal3 = (Button) findViewById(R.id.cal3);
		Button btn_cal4 = (Button) findViewById(R.id.cal4);
		Button btn_cal5 = (Button) findViewById(R.id.cal5);
		Button btn_cal6 = (Button) findViewById(R.id.cal6);
		Button btn_cal7 = (Button) findViewById(R.id.cal7);
		Button btn_cal8 = (Button) findViewById(R.id.cal8);
		Button btn_cal9 = (Button) findViewById(R.id.cal9);
		Button btn_cal10 = (Button) findViewById(R.id.cal10);
		Button btn_cal11 = (Button) findViewById(R.id.cal11);
		Button btn_cal12 = (Button) findViewById(R.id.cal12);
		Button btn_cal13 = (Button) findViewById(R.id.cal13);
		Button btn_cal14 = (Button) findViewById(R.id.cal14);
		Button btn_cal15 = (Button) findViewById(R.id.cal15);
		Button btn_cal16 = (Button) findViewById(R.id.cal16);
		Button btn_cal17 = (Button) findViewById(R.id.cal17);
		Button btn_cal18 = (Button) findViewById(R.id.cal18);
		Button btn_cal19 = (Button) findViewById(R.id.cal19);
		Button btn_cal20 = (Button) findViewById(R.id.cal20);

		if (gotoclick[0] == 1)
			btn_cal1.setBackgroundColor(Color.YELLOW);
		if (gotoclick[1] == 1)
			btn_cal2.setBackgroundColor(Color.YELLOW);
		if (gotoclick[2] == 1)
			btn_cal3.setBackgroundColor(Color.YELLOW);
		if (gotoclick[3] == 1)
			btn_cal4.setBackgroundColor(Color.YELLOW);
		if (gotoclick[4] == 1)
			btn_cal5.setBackgroundColor(Color.YELLOW);
		if (gotoclick[5] == 1)
			btn_cal6.setBackgroundColor(Color.YELLOW);
		if (gotoclick[6] == 1)
			btn_cal7.setBackgroundColor(Color.YELLOW);
		if (gotoclick[7] == 1)
			btn_cal8.setBackgroundColor(Color.YELLOW);
		if (gotoclick[8] == 1)
			btn_cal9.setBackgroundColor(Color.YELLOW);
		if (gotoclick[9] == 1)
			btn_cal10.setBackgroundColor(Color.YELLOW);
		if (gotoclick[10] == 1)
			btn_cal11.setBackgroundColor(Color.YELLOW);
		if (gotoclick[11] == 1)
			btn_cal12.setBackgroundColor(Color.YELLOW);
		if (gotoclick[12] == 1)
			btn_cal13.setBackgroundColor(Color.YELLOW);
		if (gotoclick[13] == 1)
			btn_cal14.setBackgroundColor(Color.YELLOW);
		if (gotoclick[14] == 1)
			btn_cal15.setBackgroundColor(Color.YELLOW);
		if (gotoclick[15] == 1)
			btn_cal16.setBackgroundColor(Color.YELLOW);
		if (gotoclick[16] == 1)
			btn_cal17.setBackgroundColor(Color.YELLOW);
		if (gotoclick[17] == 1)
			btn_cal18.setBackgroundColor(Color.YELLOW);
		if (gotoclick[18] == 1)
			btn_cal19.setBackgroundColor(Color.YELLOW);
		if (gotoclick[19] == 1)
			btn_cal20.setBackgroundColor(Color.YELLOW);

		btn_cal1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String id = 0 + "";

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 1 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 2 + "";
				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();

			}
		});
		btn_cal4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 3 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 4 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 5 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 6 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 7 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal9.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 8 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal10.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 9 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal11.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 10 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 11 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal13.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 12 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal14.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 13 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal15.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 14 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});

		btn_cal16.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 15 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal17.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 16 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal18.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 17 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal19.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 18 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		btn_cal20.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				String id = 19 + "";
				// Launching News Feed Screen

				Intent intent = new Intent(getApplicationContext(),
						TestPage.class);
				intent.putExtra("ComingFrom", id);
				setResult(RESULT_OK, intent);
				finish();
			}
		});

	}

	
}
